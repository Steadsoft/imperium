# Imperium - IPL
## The home of the Imperium programming language

Imperium ("IPL") is a computer programming language that emphasizes readability, extensibility, internationalization and pragmatism. The name "Imperium" is a Latin term meaning "control" in English. The language is designed to provide the developer with control, it is well suited for use on Microcontrollers for example by virtue of its range of memory defining features, padding and alignment as well as its support for "bit" data types enabling fine grained control over bit level memory layouts.

The language has no "reserved words" which means it doesn't care if an identifier happens to also be the same as a language keyword, adding new keywords is therefore straightfoward because backward compatibility is always guaranteed. The language also supports international use, it can be used with English, French, Dutch and other keyword sets and additional language keyword sets can be easily added.

The language began with an emphasis on the grammar, the grammar structure was carefully designed and refined to provide the extensibility features needed. The grammar is mostly influenced by the PL/I language but is not a clone of PL/I, it also borrows ideas from Algol and Pascal and Oberon and Raku, it is not an Object Orineted language. It can be characterized as a language that follows a keyword based pattern, all statements (except assignment statements) begin with a language keyword followed by optional and 
mandatory attributes.

## Goals

The goals of this language project include:

* To make it easier to develop code that must manipulate data at an arbitrary bit level. 
* Supporting bit strings with flexible alignment and padding and field ordering control. 
* Have no reserved words.
* Support multiple keyword sets for different cultures.
* Use keywords and "end" to delimit statement blocks.
* Support easy to read numeric literals and number bases.
* Support strings as a data type.
* Provide language functions and intrinsics.
* Eliminate pointer arithemtic.
* Support both pointer and offset as language types.
* Provide powerful preprocessing features.
* Make it easy to work with big or little "endian" targets.

## Basic Characteristics

The langauge is a compiled language, source files are UTF-8 and suffixed `.ipl` for *Imperium Programming Language*. The language enforces evlaution order in expressions and argument lists in strict left to right order, in this sense it follows Java and C# by not permitting the order to be undefined.

Short circuit evaluation of AND and OR operators is at the discretion of the developer by use of the operators `?&` or `?|` meaning "only evaluate the right argument if the left argument evaluates to `true` or `false`" respectively.

The language supports "names spaces" via the `scope` and `uses` keywords:

```
uses system.hardware;
uses math.stats;

scope gps.utilities;

// Code goes here!

end;
```

Structures and enumerated types are created using the `type` keyword which allows an alias name to be defined for them. Declaring instances of structures or enums is then done exclusively by uisng that type or alias.

Numeric literals are very natuarl and easy to work with. They can contain embedded spaces or underscores and they terminate in an optional base definition, these are examples of assigning a literal constant to some variable:

```
speed = 12 000 000; // 12 million
speed = 1010 1101:b;  // binary 173
speed = D02C 6F73 FADE 03FC:h; // hex
speed = 1010.1101:B; // binary fraction
speed = F04D.84AC:H; // hex fraction
speed = 263 604 650:O; // octal integer
```
The mainstay `DO` construct in PL/I was abandoned and an alternative grammar created that looks similar but has some advantages. Instead each keyword that can encapsulate a statement block, now has a matching end, for example:

```
if counter > last_count then
   call reset_system;
   log("System has been reset");
end;
```

The `if` statement also now supports the `elif` keyword too:
```
if counter > last_count then
   call reset_system;
   log("System has been reset");
elif counter < last_count then
   log("Too early");
else
   log("You should never see this!");
end;
```
Eliminating the `DO` meant that a new way to describe loops was required, that's done as show below, using the `loop` keyword:

```
loop while (I >= J);
   I = get_updated_count(J);
end loop;
```
The `loop` can appear alone or with optional `while` and/or `until` and these can be placed in any order, there's also the usual iterative form too. Note too how the `end` statements for these constructs can have an optional keyword appended that can be used to improve code readability.

The `call` statement has no need of parentheses when the called procedure has no arguments, the very use of `call` makes it clear what the statement is doing. As expected, IPL includes operators for bit shifts and rotates:

```
a = b << c; // logical shift left
a = b >> c; // logical shift right
a = b >>> c; // arithmemtic shift right
a = b <<@ 4; // rotate 4 bits to the left
a = b @>> 6; // rotate 6 bits to the right
```
Each argument in an argument list is always evaluated strictly in left to right order. The same is true too for arrays or arrays of structures, wherever multiple subscripts are needed to fully define a reference, they are always evaluated left to right:

```
today_results = totals(get_totals(X)).subsets(get_subset(Y)).value;
```
Labels use a different syntax too, one that offers slightly better readability:
```
@here_we_go_again
   
   if count > MAX then
      goto here_we_go_again;
   else
      count = get_the_latest();
   end;
```
As in the PL/I language, labels can be subscripted:

```
@state(0)

   call reset(age);
   
   if age > 0 then 
      goto state(1);
   end;
   
@state(1)

   call try_again(age);
   
   if age < 1 then 
      goto state(age);
   end;
```   
The `if` statement also utilizes chained comparison operators:

```
if arg < roof < start then
 return;
 end;
```	 
this is equivalent to:
```
if arg < roof & roof < start then
 return;
 end;
```	 
       
## Culture Agnostic

Consider these three code fragments
```
procédé French (X)

	déclarer counter binaire(15);	

        counter = FACE B034 D85F BAD7:H;

	si counter > 0 ensuite
	   appeler retour; // call the tour analyzer on the map.
	autre
	   retour;
	fin;

	boucle tandis que (a > b)
	   aller à place;
	fin;

fin;
```
```
procedure English (X)

	declare counter binary(15);	
 
        counter = FACE B034 D85F BAD7:H;

	if counter > 0 then
	   call retour; // call the tour analyzer on the map.
	else
	   return;
	end;

	loop while (a > b)
	   go to place;
	end;

end;
```
```
routine German (X)

	deklarieren counter binär(15);	

        counter = FACE B034 D85F BAD7:H;

	wenn counter > 0 dann
	   aufrufen retour; // call the tour analyzer on the map.
	anders
	   rückkehr;
	ende;

	wiederholen solang (a > b)
	   gehen place;
	ende;

ende;
```

Each of these generates an identical parse tree, each was parsed by the same parser and an argumnet defining the language keywords code "en", "fr" or "de". You can see that the English fragment uses `call` to invoke a procddure named `retour`. But `retour` *just happens to be* French for the keyword `return` (in English) yet there's no problem because the language has no reserved words, it doesn't care how identifiers are spelled.

Because of this behavior it was decided that the project will formally support the goal of being culture agnostic, so over time it's expected that the keyword dictionaries will grow and mature and cover a broad range of alphabets and human written langauges.

## Keyword Dictionaries

We appreciate and encourage contributions to the [keyword dictionaries](https://github.com/Steadsoft/imperium/blob/main/grammar/Antlr/imperium.keywords.json), either fresh new language entries or additions, corrections or improvmements to an existing one, just create a Pull Request and it will be readily considered. 

It is also valuable to define reasonbale abbreviations where this makes sense in the target language, though this only makes sense for keywords with either a long spelling or where the abbrevation is commonly understood or intuitive in the target language. 

For example the keyword `Binary` has English keywords of `binary` and `bin`, also lowercase keywords are preferred but if there's a target langauge cultural justification to do otherwise then this will be considered, a check is made to esnure no keyword/abbreviation appears more than once in any language.

Because this is very early stage development, changes to existing keywords is very feasible, nobody is likely to be negatively impacted if some keyword gets replaced/changed.

## Changes from standard PL/I

Although the PL/I grammar provides the *foundation* for IPL, some changes have been made that are considered beneficial and improve readability. The grammar that was used as the basis for IPL is formally defined in the [ANSI X3.74-1987](https://webstore.ansi.org/standards/incits/ansix3741987r1998) standard document. Unfortunately that document isn't freely available. Each change was made after careful consideration, no change was made without a sound justification.

This table describes the changes

| Grammar fragment		| Description		
| --- 				| :--- 		
| `literals` 			| Space/Underscore allowed as a separator	
| `literals`  			| New notaion introduced for terminating a literal 	
| `literals`                    | Hexadecimal and Octal literals are supported
| `select` 			| Semicolon after the `select` expression, has been removed
| `if`                          | New optional keyword `elif` introduced
| `do`                          | The `do` keyword has been removed from the language
| `do` `end`			| All keywords for block statements have no `do` and must be terminated by `end`
| `labels`                      | All labels are identifiers prefixed by `@` there is no trailing `:` anymore
| `procedure`                   | No longer named with a label but with an identifier following the `procedure` keyword
| `procedure`                   | Fuctions now use new keyword `function` as opposed to `procedure`
| `end`				| The `end` for block statements can be followed by the block's keyword now
| `operators`                   | Several new operators are added for shift, rotate and so on
| `comparison`                  | Comparison chaining has been adopted
| `comments`                    | Multiline and multiquoted comments are supported
| `select`                      | The `otherwise` keyword replaced with `else`
| `declare`                     | Argument declarations must now use `arg` or `argument`
| `namespace`                   | Namespaces are now supported
| `keywords`                    | All keywords are lower case and available for multiple cultures/languages
| `identifiers` 		| Unicode charaters and the `$` symbol are supported
| `do loops`                    | All loops begin with `loop` keyword with optional `while` `until` and so on.







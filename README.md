# Imperium - IPL
## The home of the Imperium programming language

Imperium ("IPL") is a computer programming language that emphasizes readability, extensibility, internationalization and pragmatism. The name "Imperium" is a Latin term meaning "control" in English. The language is designed to provide the developer with control, it is well suited for use on Microcontrollers for example by virtue of its range of memory defining features, padding and alignment as well as its support for "bit" data types enabling fine grained control over bit level memory layouts.

The language has no "reserved words" which means it doesn't care if an identifier happens to also be the same as a language keyword, adding new keywords is easy because backward compatibility is always ensured. The language also supports international use, it can be used with English, French, Dutch and other keyword sets and additional language keyword sets can be easily added.

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







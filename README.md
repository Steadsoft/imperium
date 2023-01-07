# Imperium
## The home of the Imperium programming language

Imperium is a programming language that emphasizes readability, extensibility, internationalization and pragmatism. The name "Imperium" is a Latin term meaning "control" in English. The language is designed to provide the developer with control, it is well suited for use on Microcontrollers for example by virtue of its range of memory defining features, padding and alignment as well as its support for "bit" data types enabling fine grained control over bit level memory layouts.

The language has no "reserved words" which means it doesn't care if an identifier happens to also be the same as a language keyword, adding new keywords is easy because backward compatibility is always ensured. The language also supports international use, it can be used with English, French, Dutch and other keyword sets and additional language keyword sets can be easily added.

The language began with an emphasis on the grammar, the grammar structure was carefully designed and refined to provide the extensibility features needed. The grammar is mostly influenced by the PL/I language but is not a clone of PL/I, it also borrows ideas from Algol and Pascal and Oberon, it is not an Object Orineted language. It can be characterized as a language that follows a keyword based pattern, all statements (except assignment statements) begin with a language keyword followed by optional and 
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

## Basic Characteristics

The langauge is a compiled language, source files are UTF-8 and suffixed `.ipl` for *Imperium Programming Language*. The language enforces evlaution order in expressions and argument lists in strict left to right order, in this sense it follows Java and C# by not permitting the order to be undefined.

Short circuit evaluation of AND and OR operators is at the discretion of the developer by use of the operators `?&` or `?|` meaning "only evaluate the right argument if the left argument evaluates to `true` or `false`" respectively.

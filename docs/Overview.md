# Overview of IPL

This document is intended to familiarize you with the language. This documentation assumes the source code is written using the English (en) keyword lexicon.

The language relies on a consistent grammar in which every statement must start with a keyword except for assignments. Each keyword is followed by terms that are specific to that keyword, for example declarations and definitions use the `declare` (or `dcl`) and `define` (or `def`) keywords followed by an identifier.

For some keywords, the grammar allows one or more optional attributes, these attributes sometimes have their own options specified within parentheses and these attributes can be listed in any order.

All of these are syntactically valid, you do not need to remember any specific ordering for any attributes.

```
dcl user_name string(32);
dcl user_name static string(32);
declare user_name based(p) string(32);
dcl user_name string(32) volatile stack;
```
Some keywords have an abbreviated form when the keyword itself is long and a reasonbale abbreviation is possible, this is also true of many attributes.

## Scopes

IPL uses the `scope` keyword to define *namespaces*. Everything contained immediatly within a `scope` becomes part of the scope's namespace. For example

```
scope interrupts;

  procedure sys$keypress(k) interrupt;
    // procedure's body
  end;

end;
```
Here the fully qualified name of the interrupt handler is `interrupts.sys$keypress`. Scopes allow you to create different items that have the same local name without their being a name collision.

Scopes can be nested:

```
scope interrupts;
  scope io;
  
    procedure sys$keypress(k) interrupt;
      // procedure's body
    end;
    
  end;
end;
```

Here the fully qualified name of the interrupt handler is `interrupts.io.sys$keypress`. Scopes can also define multiple scoping levels:

```
scope interrupts.io;

  procedure sys$keypress(k) interrupt;
    // procedure's body
  end;

end;
```

## Procedures and Functions

IPL syntax distinguishes between a `procedure` and a `function`. Procedure *invocations* cannot be appear as operands in expressions whereas function invocations can. A procedure is 
akin to a `void` function in languages like C and C#. Procedures cannot "return" values whereas functions can. Here's some examples of procedure and function definitions:

```
procedure reset(device_ptr);
  arg device_ptr ptr;

end;
```
```
procedure startup main;
  arg device_ptr ptr;

end;
```
```
proc read_bytes(io_ptr) interrupt(stdcall) reentrant;

end proc;
```
```
function get_length_of_list(list_ptr) retrns (bin(15));

end func;
```

As you can see, some keyword statements are paired with a corresponding `end` statement and the `end` statement can optionally be followed by the keyword that it corresponds too or by the abbreviation of the keyword it corresponds to.

## Assignments
The only way you can update memory using the IPL language is by executing assignment statements. IPL does not support operators that are also assignments. There are no pre or post incerements for example. It is not possible for memory to be updated when evaluating an expression *unless* that expression involves a user written function that contains assigment statements or invokes other procedures or functions that contain assignment statements.



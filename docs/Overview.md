# Overview of IPL

This document is intended to familiarize you with the language. 

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

Here the fully qualified name of the interrupt handler is `interrupts.io.sys$keypress`. Scopes can also define multiple scopings:

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



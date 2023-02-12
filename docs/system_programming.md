# System Programming Features
The IPL language is intended to be at least as able as C for implementing systems programming. This includes use cases like operating systems, interrupt handling,
bootstrapping and "bare metal" code as seen in certain kinds of microcontroller systems. It is a design goal to abstract many systems oriented features away from targets,
minimize the degree to which these things are left to implementors and embrace them as innate characteristics of the IPL language.

## Categories
The following categories of systems features are currently recognized:

* Direct register manipulation
* Hardcoded address use
* Linker directives
* Call and return semantics
* Platform initilaization

There is some overlap between these IPL features and many of the vendor specific extensions and attributes supported for C amongst different implementations.
An effort is made to make these more uniform and neutral in IPL than they are in C leading to greater code portability. 

### Direct register manipulation

#### Stack Pointer
There is sometimes a need to initialize a CPU's stack pointer within code that is part of a bootstrap or initilaization phase. Typically this can be done using
a linker script but sometimes it is neccesary to have runtime code play a role in setting the initial stack pointer, for example there might be hardware related
parameters that play a role in selecting a specific stack pointer address. 

#### Hardcoded Addresses
Although one can specify the address of something using a linker script, it is sometimes useful to be able to specify an absolute address with the source code, where a
datum is declared. This is made possible with the `at` optional attribute.

A similar specificty is also supported by the use of the `section` optional attribute, this causes designated code or data to be situated within a specific section when 
the code is linke.

### The `traits` keyword
The language provides a way to encapsulate declarations with a set of system oriented attributes or traits. Many of these are akin to their C counterparts as specified in the `__attribute__` option.

Rather that repetitively applying such attributes to a host of declaration or procedure we can just create a `traits` block to wrap them:

```
scope system.vectors;
    traits proc(naked, section(".vectors"));

      proc Reset_Handler;
        // copy ISR handler addresses from FLASH to RAM
      end;
      
      procedure Default_Handler;

        loop; // infinite loop
        end;
      end;

    end traits;
end scope;
```
Where possible the same terms have been used as are typically used in C systems software. There are optionally two kinds of traits, `procedure` and `declare` traits which apply to procedures/functions and to declarations (like static arrays and so on). Each trait kind has parenthesized commalist of those traits that are applicable to that kind of entity.


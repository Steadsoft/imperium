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


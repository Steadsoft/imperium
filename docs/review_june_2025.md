I'm reviewing the grammar and the language goals. Want to remove stuff that's not essential to a systems language and de-emphazise some of the PL/I elements and focus on a tighter simpler language.

No need for the base/scale stuff from PL/I binary/decimal fractions are out of scope.
integer types are now:

`byte`      1
`short`     2
`word`      4
`dword`     8
`qword`    16 

`ubyte`
`ushort`
`uword`
`udword`
`uqword`

the `bit` type is not arithemtic much closer to a string (as it was in PL/I) so like a string it has a length specifier.

`dcl control_bits bit(16);`

There is an alignment question, both for control_bits itself and for the bits within it.

This could perhaps be expressed as: `align(1,1)` meaning the datum itself is aligned on a one byte boundary and the bits on a bit boundary (i.e. this case has one byte in size) and `align(2,8`) means the datum is aligned on a two byte boundary and each bit on a byte boundary.

We can have defaults yet allow each datum within a structure to have an `align` specification if desired.

Maps are out of scope for now.

declared items (like `word`) have a default alignment based on type like any other laguage. Bits align on a byte boundary by default.

We support `endian(big)` and `endian(small)` on numeric types (integer and floats)

We allow a bit string (up to some max length) to be treated as an unsigned integer in calculations, perhaps just using basic coonversion to the nearest sized integer.

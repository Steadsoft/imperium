## This is an informal list of outstanding questions and decisions

* ~~Should we disallow functions that take no arguments?~~
  - ~~This is to resolve the grammar question of should empty argument lists be permitted.~~
  - ~~The only use case for this is a function that takes no args, so disallowing that resolves the issue.~~
  - ~~A procedure with a single, pass by reference argument is preferred, perhaps a `get` prefixed method name for example.~~
  - ~~Mathematically a function is a mapping, so if there's nothing to map why make it a function?~~
  - Allowing an empty argument list seems the less contentious way to do this.
* Should string literals use `'` or `"`?
* Should we support a `text` type for 8-bit strings and `string` type for two-byte Unicode?
  - Should a `text` represent an array of `byte` and `string` represent an array of `char`?
  - Consider the way .Net manages [encoding/decoding](https://learn.microsoft.com/en-us/dotnet/api/system.text.encoding?view=net-7.0) as a reference.
  - A good compromise is to add attributes utf(8), utf(16) and utf(32).
  - A `utf(8)` string will always contain single byte characters unless a mutibyte Unicode char is assigned to it so we get the storage minimization.
  - This means we'll have a `string(X)`; or `string(X) utf(Z)`; where Z is 8, 16 or 32, without the `utf` it defauts to `utf(8)`.
* Revise long-ish keywords
  - `returns`
  - 
* Consider incorporatring support for Verliog's `reduction` operators.
  - These operators seem very reasonable but their overall utility is an open question
  - `&(<expression>)`
  - `^(<expression>)`
  - `|(<expression>)`
  - `~&(<expression>)`
  - `~^(<expression>)`
  - `~|(<expression>)`
* Consider a `byte` data type that is an abstract eight bit unit, not numeric, not signed. 
  - A general buffer can be declared as `dcl some_buffer(4096) byte;` for example.
  - Metadata describing its capacity will be retained, eliminating the need and risk of passing that around.

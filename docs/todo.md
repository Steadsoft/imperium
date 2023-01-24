## This is an informal list of outstanding questions and decisions

* Should we disallow functions that take no arguments?
  - This is to resolve the grammar question of should empty argument lists be permitted.
  - The only use case for this is an function that takes no args, so disallowing that resolves the issue.
* Should string literals use `'` or `"`?
* Should we support a `text` type for 8-bit strings and `string` type for two-byte Unicode?
  - Shuold a `text` represent an array of `byte` and `string` represent an array of `char`?

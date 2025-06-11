Structure definitions can be cumbersom and verbose so we need to address this afresh.

struct <structname> <options>,
    counter    dword,
    message    string(32),
    status     bit(8), // last comma optional and tolerated
    end


enum <enumname> <options>,  // perhaps these commas can be optional in a similar way to semicolons
     member_1 <value>,
     member_2 <value>
     end

dcl map <structname>

In general code statements are separated by either NL or SC so two statements on the same line 
must be separated by a SC.

In a struct members are separated by either a NL or CM so two members on the same line must be separated by a CM


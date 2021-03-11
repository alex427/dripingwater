grammar csv;

file: record+;

record: INT (',' INT)* '\n'
    | INT (';' INT)* '\n'
    ;

INT: '0'..'9'+;

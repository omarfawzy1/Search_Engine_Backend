grammar searchGrammar;
//PO with Code = 20220001
//PO with Vendor = 0000002-ZHejiang
//PO with state = shipped
//PO with Code ~ 20220001
//Grammer <Type><with key Word><Searched by><Search Operator><CODE>
search : TYPE WITH SEARCH_BY SEARCH_OPERATOR CODE*  ;
TYPE : [Pp][Oo] ;
WITH : [Ww][Ii][Tt][Hh];
SEARCH_BY : [Cc][Oo][Dd][Ee] | [Vv][Ee][Nn][Dd][Oo][Rr] | [Ss][Tt][Aa][Tt][Ee] | [Tt][Yy][Pp][Ee] | BusinessUnit | ReferenceDocument;
SEARCH_OPERATOR : '=' | '~' ;
CODE : [a-zA-Z0-9_-]+ ; // 123 // aaaa //AWSAS //aaqAZA //123Aaas //a ..z | //A ..Z 0 0..9 //
BusinessUnit : [Bb][a-zA-Z ]*[Tt] ;
ReferenceDocument : [Rr][a-zA-Z ]*[Tt];
CRLF : '\r'? '\n' | '\r';
WS : [ \t\n\r]+ -> channel(HIDDEN) ;





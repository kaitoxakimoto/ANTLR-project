java -jar lib\antlr-4.7.1-complete.jar antlr\ParserT.g4 -no-listener -visitor -encoding UTF-8 -lib antlr -package ANTLR -o antlr
move antlr\antlr\* src\ANTLR
#!/bin/bash

echo "Generando lex.yy.c"                               &&
flex scanner.l                                          &&
echo "Flex generado"				        &&

echo ""                                                 &&
echo "Generando parser.tab.h y parser.tab.c"            &&
bison -d -v parser.y                                    &&
echo "Bison "                                           &&

echo ""                                                 &&
echo "Compilando los archivos"                          &&
gcc tablasimbolos.c parser.tab.c lex.yy.c -lfl -ggdb -o exec -Wall -Wextra   &&
echo "GCC --------------------------------- OK"         &&

echo ""
./exec hola.txt

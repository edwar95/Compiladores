%option yylineno
%option noyywrap
delim [ ,\n,\t]     
ws {delim}+
id {letra}({letra}{digito})*
ignorar_comentarios "//"({letra}|" "|{char}|{digito})*|"/*"({letra}|" "|{char}|{digito})*
ignorar " "|\t|\n
letra [a-zA-Z]
char [']+({letra}|{digito}|{ws})*+[']    
digito [0-9]
booleano "true"|"false"

string ["]+({letra}|" "|{char}|{digito})*+["]
%%
{ignorar_comentarios}               {;} 
{ignorar}		{;}

#include		{printf("INCLUDE \n");}


int                     {printf("INT \n");}
float                   {printf("FLOAT \n");}
bool                    {printf("BOOL \n");}
char                    {printf("CHAR \n");} 
string                  {printf("STRING \n");}
if                      {printf("IF \n");}
then                    {printf("THEN \n");}    
else                    {printf("ELSE\n");} 
while                   {printf("WHILE\n");}  
do                      {printf("DO\n");} 
input                   {printf("INPUT\n");}
output                  {printf("OUTPUT\n");}
return                  {printf("RETURN\n");}
":"			{printf(":\n");}
","			{printf(",\n");}
";"			{printf(";\n");}
"("			{printf("(\n");}
")"			{printf(")\n");}
"["			{printf("[\n");}
"]"			{printf("]\n");}
"{"			{printf("{\n");}
"}"                     {printf("}\n");} 
"+"			{printf("SUMA\n");}
"-"			{printf("RESTA\n");}
"*"			{printf("MULTIPLICACION\n");}
"/"			{printf("DIVISION\n");}

">"			{printf("MAYOR\n");}
"<"			{printf("MENOR\n");}
"="			{printf("ASIGNADOR\n");}
"!"			{printf("NEGACION\n");}
"&"			{printf("AND BINARIO\n ");}
"$"			{printf("ASIGNADOR\n");}
"=="			{printf("IGUAL \n");}
">="			{printf("MAYOR IGUAL \n");}
"<="			{printf("MENOR IGUAL\n");}
"!="			{printf("DIFERNETE\n");}
"&&"			{printf("AND LOGICO\n");}
"||"			{printf("OR \n");}
main			{printf("MAIN\n") ;}
-?{digito}+		{printf("ENTERO\n") ;}
{digito}"."{digito}+	{printf("FLOAT\n");}
{booleano}		{printf("BOOLEANO\n");}
{char}		{printf("CARACTER\n");}
id {printf("IDENTIFICADOR\n");}
.			{printf("ERROR en linea: %d \n",yylineno);}
{string} 		{printf("string\n");}
 

%%

yyerror(char * msg){
printf("%s\n",msg);
}

int main(void){

yyin=fopen("entrada.txt","rt");

if(yyin==NULL){
printf("no se pudo abrir el archivo");
}else{

yylex();
}

}

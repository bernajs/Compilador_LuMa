#include <stdio.h>
#include <conio.h>
int main ()
{
int numero;
printf("Inserte un numero:");
scanf("%d",&numero);
if(numero==0)
 printf("El numero %d es NULO",numero);
else
{
if(numero<0)
     printf("El numero %d es NEGATIVO",numero);
else
     printf("El numero %d es POSITIVO",numero);
}
getch();
}


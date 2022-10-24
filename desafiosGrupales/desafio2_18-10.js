/*Exercise #1
Write a program that takes in an array of numbers
and returns the largest number in the list.
Example: The given array is [3, 5, 7, 1, 6] The largest number is 7.

[3, 5, 7]    */


function numb_mayor(lista_numeros){ //---> numb_mayor(3)
    var numero_mayor = lista_numeros[0]
    for (cont = 0; cont < lista_numeros.length; cont++){ // ---> cont = 0 ; 
 
        if (numero_mayor < lista_numeros[cont + 1]){ //
            numero_mayor = lista_numeros[cont + 1] //
        }
    }
    console.log(numero_mayor)
}

numb_mayor([100,5, 900, 400])

/* Exercise #2
Write a program to sort a list of
numbers in descending order (from highest to lowest). */

function ordenar_numeros(lista_numeros){
    
}
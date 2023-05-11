package main

import "fmt"

func main() {
	var amigos int
	var galletas int

	fmt.Println("Ingrese numero de amigos: ")
	fmt.Scanln(&amigos)
	fmt.Println("Ingrese cantidad de galletas: ")
	fmt.Scanln(&galletas)

	var cantAmigo = (galletas / amigos)
	var resto = (galletas % amigos)

	fmt.Println("La cantidad de galletas por amigo es de", cantAmigo)
	fmt.Println("Y sobran ", resto)
}

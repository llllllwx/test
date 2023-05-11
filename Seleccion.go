package main

import "fmt"

func main() {
	var numer, denom int

	fmt.Println("Ingrese el numerador: ")
	fmt.Scanln(&numer)
	fmt.Println("Ingrese el denominador: ")
	fmt.Scanln(&denom)

	if denom == 0 {
		fmt.Println("El denominador no puede ser 0")
		fmt.Println("Ingrese el denominador: ")
		fmt.Scanln(&denom)
	}

	if numer < denom {
		fmt.Println("La fracción es propia")
	} else {
		parteEnt := numer / denom
		newNumer := numer % denom

		if newNumer == 0 {
			fmt.Println("La fracción es impropia y como numero mixto es", parteEnt)
		} else {
			fmt.Println("Es una fracción impropia y como numero mixto es", parteEnt, "y", newNumer, "/", denom)
		}

	}

}

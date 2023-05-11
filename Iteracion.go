func main() {
	var num, suma int

	fmt.Println("Ingrese un numero a analizar: ")
	fmt.Scanln(&num)

	for i := 1; i <= num/2; i++ {
		if num%i == 0 {
			suma += i
		}
	}
	if num == suma {
		fmt.Println(num, " es un numero perfecto")
	} else {
		fmt.Println(num, " no es un numero perfecto")
	}
}

package main

import "fmt"

func main() {
	fmt.Println("Hello Surendar!")
	var name string = "surendar"
	var age int = 20
	fmt.Println(name)
	fmt.Println(age)

	name2 := "secondname"
	fmt.Println(name2)

	var a, b, c float64 = 10, 20, 30
	fmt.Println(a)

	fmt.Println(b)
	fmt.Println(c)

	var d = true
	fmt.Println(d)

	for i := 1; i <= 5; i++ {
		fmt.Println(i)
	}

	// for {

	// }

	fruits := []string{"apple", "orange", "kiwi"}

	fmt.Println(fruits)

	for value, _ := range fruits {
		fmt.Println(value)

	}

	marks := map[string]int{
		"tamil": 90,
	}

	marks["English"] = 85
	delete(marks, "Maths")
	fmt.Println(marks)

	value, exists := marks["English"]
	fmt.Println(value)
	fmt.Println(exists)

	for key, value := range marks {
		fmt.Println(key)
		fmt.Println(value)
	}

	employees := map[string]int{
		"Ram":      50000,
		"John":     60000,
		"Surendar": 70000,
	}

	fmt.Println(employees["Surendar"])

	employees["Ravi"] = 40000

	employees["Ram"] = 45000

	for key, value := range employees {
		fmt.Println(key)
		fmt.Println(value)
	}

	for key, value := range employees {
		fmt.Printf("%s -> %d\n", key, value)
	}

	emp := Employee{
		Name:   "Surendar",
		Salary: 50000,
	}

	fmt.Println(emp)

	var result int = add(5, 3)
	fmt.Println(result)

}

type Employee struct {
	Name   string
	Salary int
}

func add(a int, b int) int {
	return a + b
}

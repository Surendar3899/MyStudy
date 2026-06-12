package main

import "fmt"

func main() {
	fmt.Println("started")
	nums := []int{1, 2, 3, 1}
	var result bool = containsDuplicate2(nums)
	fmt.Println(result)
}

func containsDuplicate(nums []int) bool {
	ma := make(map[int]int)
	for _, value := range nums {
		ma[value]++

		if ma[value] > 1 {
			return true
		}

	}

	return false

}

func containsDuplicate2(nums []int) bool {
	set := make(map[int]bool)
	for _, value := range nums {
		if set[value] {
			return true
		}

		set[value] = true

	}

	return false

}

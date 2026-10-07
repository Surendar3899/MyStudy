package main

import (
	"fmt"
	"sync"
	"time"
)

var counter int
var mu sync.Mutex

func task(name string) {
	for i := 1; i <= 5; i++ {
		fmt.Println(name, i)
		time.Sleep(time.Second)
	}
}

func main() {
	// go task("A")
	// go task("B")
	// time.Sleep(6 * time.Second)
	for i := 1; i <= 100000; i++ {
		go increment()
	}
	time.Sleep(time.Second)
	fmt.Println("counter is ", counter)

}

func increment() {
	mu.Lock()
	counter++
	mu.Unlock()
}

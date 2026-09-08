class DynamicArray:
    
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.length = 0
        self.array = [0] * self.capacity

    def get(self, i: int) -> int:
        return self.array[i]

    def set(self, i: int, n: int) -> None:
        self.array[i] = n

    def pushback(self, n: int) -> None:
        # should check first if our array is at its limit capacity 
        if self.length == self.capacity:
            self.resize()

        # then we can insert it at the end, meaning we insert it at the current length index
        self.array[self.length] = n
        self.length += 1

        

    def popback(self) -> int:
        if self.length > 0: 
            self.length -= 1
        return self.array[self.length]

    def resize(self) -> None:
        self.capacity = 2 * self.capacity
        new_array  = [0] * self.capacity
        
        for i in range(self.length):
            new_array[i] = self.array[i]
        self.array = new_array 

    def getSize(self) -> int:
        return self.length
    
    def getCapacity(self) -> int:
        return self.capacity
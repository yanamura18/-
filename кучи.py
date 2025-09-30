class BinaryHeap:
    def __init__(self):
        self.heap = [ ]
    
    def push(self, item):
        heapq.heappush(self.heap, item)


class BinomialTree:
    def __init__(self, key):
        self.key = key
        self.children = [ ]

#куча Фибоначчи
def fibonacci(n):
  if n in (1, 2):
    return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
print(fibonacci(10))

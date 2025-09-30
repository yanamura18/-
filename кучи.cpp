class BinaryHeap {
private:
    std::priority_queue<int, std::vector<int>, std::greater<int>> min_heap;

public:
    void push(int value) {
        min_heap.push(value);
    }

//Биноминарная куча
template<typename T>
class BinomialHeap {
    struct Node {
        T value;
        std::vector<Node*> children;
    };
    std::vector<Node*> trees;
};

class FibonacciHeap {
private:
    FibonacciNode* min_node;
    int count;
    

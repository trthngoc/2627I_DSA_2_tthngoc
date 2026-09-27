### a) 

Mỗi 3 thao tác in 1 lần => Ta có chương trình hoạt động như sau:

```
- Chuỗi ban đầu []

enqueue(0) -> [0]
enqueue(1) -> [0, 1]
dequeue() -> [1]
    => In: 1

enqueue(2) -> [1, 2]
enqueue(3) -> [1, 2, 3]
dequeue() -> [2, 3]
    => In: 2 3

enqueue(4) -> [2, 3, 4]
enqueue(5) -> [2, 3, 4, 5]
dequeue() -> [3, 4, 5]
    => In: 3 4 5

enqueue(6) -> [3, 4, 5, 6]
enqueue(7) -> [3, 4, 5, 6, 7]
dequeue() -> [4, 5, 6, 7]
    => In: 4 5 6 7
```
***=> Kết quả: 1 2 3 3 4 5 4 5 6 7***

### b)
$Θ(n)$ (trường hợp tồi nhất: sau khi enqueue phải chạy hàm tự in)

### c) 
$Θ(n)$
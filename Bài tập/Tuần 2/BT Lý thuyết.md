## Bài 1:

1. Vòng for gọi i bắt đầu từ 10, mỗi lần lặp tăng 2 đơn vị cho tới n+4
    
    => Số lần gọi op() bằng $\frac{(n + 5) - 10}{2} = \frac{1}{2}n - 2.5$ ~ $\frac{1}{2}n$

    => $Θ(n)$
2. Vòng for gọi i từ 1, mỗi lần lặp nhân đôi tới $n^3$

    => Số lần gọi op() bằng $\log_2(n^3)$ = $3\log_2(n)$ ~ $3logn$

    => $Θ(logn)$
3. Vòng for gọi i từ 0, mỗi lần lặp tăng 1 đơn vị tới n. Mỗi lần thực hiện vòng lặp gọi j từ 0 tới 99, mỗi lần lặp tăng 1 đơn vị

    => Số lần gọi op() bằng $100n$ ~ $100n$

    => $Θ(n)$
4. Vòng for gọi i từ 0, mỗi lần lặp tăng 1 đơn vị không lớn hơn $\sqrt{n}$. Mỗi lần thực hiện vòng lặp gọi j từ 1 tới n-1, mỗi lần lặp tăng 3 lần

    => Số lần gọi op() bằng $\sqrt{n}\log_3n$ ~ $\sqrt{n}\log_3n$

    => $Θ(\sqrt{n}logn)$
5. Vòng for gọi i từ 0, mỗi lần lặp tăng 1 đơn vị tới n - 1. Mỗi lần thực hiện vòng lặp gọi j từ 1 tới n-1, mỗi lần lặp tăng gấp đôi

    => Số lần gọi op() bằng $n\log_2n$ ~ $nlogn$

    => $Θ(nlogn)$
6. Bốn vòng for lồng nhau, lần lượt gọi:
- i từ 0 tới n-1, mỗi vòng tăng 1 đơn vị
- j từ 0 tới 99, mỗi vòng tăng 1 đơn vị
- k từ 0 tới n-1, mỗi vòng tăng 1 đơn vị
- l từ k tới n-1, mỗi vòng tăng 1 đơn vị

    => Số lần gọi op() bằng $n \times 100 \times \frac{n(n+1)}{2}$ = $50n^2(n+1)$ = $50n^3 + 50n^2$ ~ $50^3$

    => $Θ(n^3)$

## Bài 2:
Có 3 vòng lặp lồng nhau, lần lượt gồm:
- i chạy từ 0 tới $n^2 - 1$, mỗi vòng tăng 1 đơn vị
- j chạy từ i+1 tới $n^2$, mỗi vòng tăng 1 đơn vị
- k chạy từ 1 tới không quá $n^2$, mỗi vòng gấp đôi

    => Số lần chạy op() bằng $\frac{n(n+1)}{2}\log_2n$ = $\frac{1}{2}n^2\log_2n + \frac{1}{2}n\log_2n$ ~ $\frac{1}{2}n^2\log_2n$

## Bài 3:
$O(n^2)$ và $Ω(n^2)$

## Bài 4:
Bộ nhớ 1 đối tượng BST sử dụng bao gồm:
1. Mỗi nút (Node) sử dụng: 16 bytes cố định, 8 bytes phát sinh, 8x5+4 bytes biến thực thể (5 đối tượng và 1 kiểu nguyên) và 4 bytes đệm.

    => Mỗi đối tượng Node tiêu thụ 72 bytes
2. Đối tượng bao ngoài BST sử dụng: 16 bytes cố định, 8+4 bytes biến thực thế (1 đối tượng và 1 kiểu nguyên) và 4 bytes đệm.

    => Đối tượng BST tiêu thụ 32 bytes

=> Tổng bộ nhớ cho mỗi BTS với n nút là $32 + 72n$ ~ $72n$ bytes

## Bài 5:
Có 3 vòng lặp lồng nhau, lần lượt gồm:
- i chạy từ 1 tới n, mỗi vòng tăng 1 đơn vị
- j chạy từ n tới i, mỗi vòng giảm 1 đơn vị
- k chạy từ 1 tới n, mỗi vòng tăng $\frac{n}{100}$ đơn vị

    => Số lần in từ "hello" bằng $\frac{n(n+1)}{2} \times (\frac{n-1}{\frac{n}{100}}+1)$ = $50n^2 + 50n$ ~ $50n^2$

## Bài 6:
$O(n\sqrt{n})$ và $Ω(logn)$
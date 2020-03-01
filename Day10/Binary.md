Converting to base2 from base10:
```javascript
    function convertToBinary(num) {
        let result = [];
        while (num > 0) {
            result.push(num % 2)
            num = Math.floor(num / 2)
        }
        return parseInt(result.reverse().join(''))
    }
```

Binary Operations

0 + 0 = 0
1 + 0 = 1
0 + 1 = 1
1 + 1 = 0 ==> no 2 in binary, we carry one over

Two's complement
Negative #s?
1- two's complement "flip the bits add 1"
2 - "extending the sign"

class oddEven{
    constructor(parameter){
        this.value = parameter
    }

    oddEv(){
    if (this.value % 2 == 0){
    console.log(this.value + " is Even number.")
    }
    else{
    console.log(this.value + " is Odd number.")
    }
    }
}

let n = 45
let obj = new oddEven(n)
ans = obj.oddEv()
console.log(ans)
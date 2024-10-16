function solution(my_string, n) {
    var answer = "";
    
    const s = my_string.split("");
    
    for(let i = 0; i < my_string.length; i++){
        for(let j = 0; j < n; j++){
            answer += s[i];
        }
    }
    
    return answer;
}
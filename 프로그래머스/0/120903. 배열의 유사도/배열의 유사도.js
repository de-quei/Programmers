function solution(s1, s2) {
    // var answer = 0;
    
    // const new_arr = s1.concat(s2);
    // const set = new Set(new_arr);
    
    // answer = new_arr.length - set.size;
    
    // return answer;

    // filter 함수 사용
    return s1.filter((e) => s2.includes(e)).length;
}

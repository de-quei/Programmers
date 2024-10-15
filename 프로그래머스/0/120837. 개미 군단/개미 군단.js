function solution(hp) {
    var ant = 0;
    
    ant += Math.floor(hp / 5);
    hp %= 5;
    
    ant += Math.floor(hp / 3);
    hp %= 3;
    
    ant += Math.floor(hp / 1);
    
    return ant;
}
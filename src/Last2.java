public class Last2 {public int last2(String str) {
    int len = str.length();
    int count = 0;
    if(len <= 2){
        return 0;
    }
    for(int i = 0; i < len-2; i++){
        String last = str.substring(len-2);
        if(str.substring(i, i+2).equals(last)){
            count++;
        }
    }
    return count;
}
}

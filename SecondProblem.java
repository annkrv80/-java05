import java.util.HashMap;

public class SecondProblem {

    public boolean isIsomorphic(String first, String second){
        if(first.length()!=second.length()){
            return false;
        }else{
            HashMap<Character,Character> firstMap=new HashMap<>();
            HashMap<Character,Character> secondMap=new HashMap<>();
            char[] firstArray=first.toCharArray();
            char[] secondArray=second.toCharArray();
            for(int i=0; i<firstArray.length; i++){
                if(firstMap.containsKey(firstArray[i])){
                    if(secondArray[i]!=firstMap.get(firstArray[i])){
                        return false;
                    }
                }else
                  if (secondMap.containsKey(secondArray[i])){
                    return false;
                } else{
                    firstMap.put(firstArray[i],secondArray[i]);
                    secondMap.put(secondArray[i],firstArray[i]);
                }
            }
        }
        return true;
    }
    
    
}



/* Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
(Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)*/
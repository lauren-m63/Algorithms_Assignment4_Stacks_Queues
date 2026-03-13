import java.util.LinkedList;

public class DecodeStrings {

    /*

    okay so
    you have a string and u want to decode it
    i dont have to do any wellness checks on the inptu
    im given how many times the encoded string is repeated and then also the string itself so

okay wat

so i see my number k and im going to wait
im confused i skip over
umm

okay so i have a compressed string and im trying to uncompress it like a zip file ? where its lossy conversion type of thing

so my compressed part is repeated k times which im given

so when i see like a number and then whatever is in the brackets im supposed to just make it that many times
but if i have those brcakts next to each other then i need my stack to keep track of where i am liek the last one okay

so im going to make my stack and copy from the other one if you see an open put it in until you find the close one then pop open out
which would workf or if the thigns are nested still


so im going through everything once to decode and also to do stack stuff sooo
o n where n is length of string for sureee and then what is k as k elemnts


concatenacing string makes a new srting everytime to keep for space and then also this bc thats a hwole time oepration
so you go through list and make new string k so its m plus k
its n times k woah

space is the same idea i have ym two stacks and then i create the varibaes k time
then my stakc memory could go up to the string length so then its jsut the same
its no its the strin glength for the stack and then also the other thing okayy
     */



    public static String decode(String s){

        LinkedList<Integer> countstack = new LinkedList<>();
        LinkedList<String> stringstack2 = new LinkedList<>();

        String cur = "";
        int track= 0;


        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                ///oos i gorot this part
            track = track * 10 + c - '0';
            } // end fi

            else if (c == '['){ //braket not parentehese
                countstack.add(track); // add insetad of push again?
                stringstack2.add(cur);
                cur = "";
                track = 0;
            }
            else if (c == ']'){
                int index = countstack.remove();
                String temp = stringstack2.remove();

                String temp2 = temp;
                for (int k = 0; k < index; k++){
                    temp+= cur;

                }
                cur = temp;

            }
            else {
                cur +=c;
            }

        }// end for




        return cur;
    }




} //LAST BRACKET

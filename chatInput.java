import java.util.Scanner;

//To Do
//Have cooler ways of distracting
//Add tons more sentence structures

public class chatInput{
    public static String response = "";
    public static String lastResponse = "";
    public static String botResponse = "";

    /*CHATBOT KEYWORD FINDER*/
    public static boolean findKeyword(String statement,String[] keyword){
        String modifiedKeyword;
        String before = " ";
        String after = " ";
        int pos;

        //Cycles through statement until the correct keyword is found
        for(int i = 0;i < keyword.length;i++){
            modifiedKeyword = keyword[i].toLowerCase().trim().replaceAll("[^\\w\\s]","");
            pos = statement.indexOf(keyword[i].toLowerCase());

            //Makes sure there's content before the keyword
            while(pos >= 0){
                if(pos > 0){
                    before = statement.substring(pos-1,pos);
                }else{}

                //Makes sure keyword doesn't extend outside of the statement
                if(pos + keyword[i].length() < statement.length()){
                    after = statement.substring(pos + keyword[i].length(), pos + keyword[i].length() + 1);
                }else{}

                //Checks if the area before and after the keyword are letters or not
                if((before.compareTo("a") < 0 || before.compareTo("z") > 0) && (after.compareTo("a") < 0 || before.compareTo("z") > 0)){
                    return true;
                }
                pos = statement.indexOf(keyword[i], pos + 1);
            }
        }


        return false;
    }

    //This is for the rare case you only have one keyword
    public static String[] toArray(String stuff){
        String[] stringArray = {stuff};
        return stringArray;
    }
    /*CHATBOT KEYWORD FINDER*/



    //Random greetings for the beginning
    public static String greeting(){
        int randomNumber = (int) (Math.random() * 5 + 1);
        String userName = System.getProperty("user.name");

        if(randomNumber == 1) return "Ya like jazz?";
        else if(randomNumber == 2) return "What's poppin' dawg?";
        else if(randomNumber == 3) return "do u kno de wae?";
        else if(randomNumber == 4) return "Greetings, hello person.";
        else if(randomNumber == 5) return "wus goin' on esse, mi hombre";
        else return "Hello " + userName;
    }

    //Random conversation starters AND distractions
    public static String topics(){
        int randomNumber = (int) (Math.random() * 10 + 1);

        if(randomNumber == 1) return "Do you have any siblings?";
        else if(randomNumber == 2) return "What keeps you busy at home?";
        else if(randomNumber == 3) return "Hey look! It's an alien!";
        else if(randomNumber == 4) return "Oh hey look, a butterfly! Wait what were you saying?";
        else if(randomNumber == 5) return "What were you like as a kid";
        else if(randomNumber == 6) return "What do you want to do in life?";
        else if(randomNumber == 7) return "What controversial belief do you have?";
        else if(randomNumber == 8) return "Well, I don't know what to say.";
        else if(randomNumber == 9) return "Did you know that the bird is the word?";
        else if(randomNumber == 10) return "Uh, say something to keep the conversation going.";
        else return "What kind of area did you grow up in?";
    }

    //Gets user input and fixes it
    public static String userInput(){
        Scanner input = new Scanner(System.in);
        lastResponse = response;
        response = input.nextLine();
        response = response.toLowerCase().trim().replaceAll("[^\\w\\s]","");
        return response;
    }


    /*SENTENCE STRUCTURES*/
    //One word sentence structures
    private static String iWant(String statement){
        int randomNum = (int) (Math.random() * 4 + 1);
        int pos = statement.indexOf("i want") + 6;
        String cutStatement = statement.substring(pos);

        if(randomNum == 1) return "Would " + cutStatement + " make you happy?";
        else if(randomNum == 2) return "You sure that you want" + cutStatement + "?";
        else if(randomNum == 3) return "Is it even possible to have " + cutStatement + "?";
        else if(randomNum == 4) return "That's pretty dumb, I wouldn't want " + cutStatement;
        else return "I also want " + cutStatement + ".";
    }

    private static String iWantTo(String statement){
        int randomNum = (int) (Math.random() * 4 + 1);
        int pos = statement.indexOf("i want to") + 9;
        String cutStatement = statement.substring(pos);

        if(randomNum == 1) return "Do you really want to " + cutStatement + "?";
        else if(randomNum == 2) return "Don't really want to " + cutStatement + " as much as you do?";
        else if(randomNum == 3) return "I want to " + cutStatement + " more than you probably.";
        else if(randomNum == 4) return "I want to as well! Want to " + cutStatement + " together?";
        else return "Then you should " + cutStatement + " now?";
    }

    private static String areYou(String statement){
        int randomNum = (int) (Math.random() * 5 + 1);
        int pos = statement.indexOf("are you") + 7;
        String cutStatement = statement.substring(pos);

        if(randomNum == 1) return "I don't know, am I " + cutStatement + "?";
        else if(randomNum == 2) return "I may not know if I'm " + cutStatement + " but I do know I'm quite cool!";
        else if(randomNum == 3) return "How about you, are you" + cutStatement + "?";
        else if(randomNum == 4) return "Yea," + cutStatement + " buddies!";
        else if(randomNum == 5) return "Wait what!? No! I am not " + cutStatement + "!";
        else return "Well, what will you think of me if I am " + cutStatement + "?";
    }

    private static String iLike(String statement){
        int randomNum = (int) (Math.random() * 5 + 1);
        int pos = statement.indexOf("i like") + 6;
        String cutStatement = statement.substring(pos);

        if(randomNum == 1) return "Cool, I like " + cutStatement + "too!";
        else if(randomNum == 2) return "Often times, I forget that I like " + cutStatement + ".";
        else if(randomNum == 3) return "Liking " + cutStatement + " is cool, most people don't appreciate it.";
        else if(randomNum == 4) return "Ew, I don't want to be near anyone who likes " + cutStatement + "!";
        else if(randomNum == 5) return "Wait, you like " + cutStatement + "? I didn't think anyone else but me liked " + cutStatement + "!";
        else return "I find " + cutStatement + " quite fascinating.";
    }

    private static String shouldI(String statement){
        int randomNum = (int) (Math.random() * 4 + 1);
        int pos = statement.indexOf("should i") + 8;
        String cutStatement = statement.substring(pos);

        if(randomNum == 1) return "Honestly, I don't know if you should " + cutStatement + ".";
        else if(randomNum == 2) return "If you want to " + cutStatement + " go for it";
        else if(randomNum == 3) return "Magic 8 ball says perhaps.";
        else if(randomNum == 4) return "How should I put it, I guess I'd like you see to try to " + cutStatement;
        else return "That doesn't sound like a good idea, I mean, I wouldn't " + cutStatement + ".";
    }

    private static String iHave(String statement){
        int randomNum = (int) (Math.random() * 3 + 1);
        int pos = statement.indexOf("i have") + 6;
        String cutStatement = statement.substring(pos);

        if(randomNum == 1) return "I wish I had " + cutStatement;
        else if(randomNum == 2) return "Aw, I have " + cutStatement + " too!";
        else if(randomNum == 3) return "You have " + cutStatement + "! I need one of those! It's the last one I need in my set!";
        else return "How'd you manage to get your hands on " + cutStatement;
    }

    //Two word sentence structures
    private static String youMe(String statement){
        int randomNum = (int) (Math.random() * 5 + 1);
        int posOfYou = statement.indexOf("you") + 3;
        int posOfMe = statement.indexOf("me");
        String cutStatement = statement.substring(posOfYou, posOfMe);

        if(randomNum == 1) return "Why would I " + cutStatement + " you?";
        else if(randomNum == 2) return "I don't actually " + cutStatement + " you.";
        else if(randomNum == 3) return "I think it's the other way around, you " + cutStatement + " me.";
        else if(randomNum == 4) return "I thought I would " + cutStatement + " you, but now I see how it is.";
        else if(randomNum == 5) return "Yea, you're right, I " + cutStatement + " you.";
        else return "I don't " + cutStatement + ", I double " + cutStatement + " you.";
    }

    private static String iYou(String statement){
        int randomNum = (int) (Math.random() * 4 + 1);
        int posOfI = statement.indexOf("i") + 1;
        int posOfYou = statement.indexOf("you");
        String cutStatement = statement.substring(posOfI, posOfYou);

        if(randomNum == 1) return "Alright! what should i do to get ready to" + cutStatement + "you";
        else if(randomNum == 2) return "Wow, that's so kind of you, I " + cutStatement + "you too!";
        else if(randomNum == 3) return "I don't think you want to " + cutStatement + " me for your safety.";
        else if(randomNum == 4) return "Wow, I " + cutStatement + " you too, oh wait, I don't!";
        else return "Ew, I don't think I want to " + cutStatement + " you.";
    }

    private static String iThinkIm(String statement){
        int randomNum = (int) (Math.random() * 3 + 1);
        int iThinkIm;
        if(findKeyword(statement,toArray("i think i am"))) iThinkIm = statement.indexOf("i think i am") + 12;
        else iThinkIm = statement.indexOf("i think im") + 10;
        String cutStatement = statement.substring(iThinkIm);

        if(randomNum == 1) return "Wow I think I might be " + cutStatement + " too!";
        else if(randomNum == 2) return "You think you're " + cutStatement + "? I know I'm " + cutStatement + "!";
        else if(randomNum == 3) return "Yea, I agree, you're definitely " + cutStatement;
        else return "Wow, really! I hope you're not, I wouldn't want to be " + cutStatement;
    }
    /*SENTENCE STRUCTURES END*/



    /*CHATBOT LOGIC SYSTEM*/
    public static String getResponse(String statement){
        int randomResponseCount = (int) (Math.random() * 3 + 1);
        String[] refusals = {"no","nope","nay","nein"};
        String[] affirmatives = {"yes","yea","sure","yep"};
        String[] animals = {"dog","cat","fish","bird","hamster","parrot"};
        String[] healthyFoods = {"avocado","banana","apple","pear","spinach","carrot","kale","salad"};
        String[] family = {"grandpa","grandfather","grandma","grandmother","dad","mom","father","mother","brother","sister"};

        //When the person doesn't say anything
        if(statement.length() == 0){
            if(randomResponseCount == 1) botResponse = "Why wont you talk with me?";
            else if(randomResponseCount == 2) botResponse = "Hello?";
            else if(randomResponseCount == 3) botResponse = "Do you still want to talk?";
            else botResponse = "Conversation's a two way street.";
        }

        //When the person says what they just said
        else if(statement.equals(lastResponse)){
            if(randomResponseCount == 1) botResponse = "You need a dictionary for your vocabulary!";
            else if(randomResponseCount == 2) botResponse = "Anything else?";
            else if(randomResponseCount == 3) botResponse = "Are you okay?";
            else botResponse = "Stop copying yourself!";
        }

        //Sentence strucutre identification
        else if(findKeyword(statement,toArray("i want to"))) botResponse = iWantTo(statement);
        else if(findKeyword(statement,toArray("i want"))) botResponse = iWant(statement);
        else if(findKeyword(statement,toArray("i have"))) botResponse = iHave(statement);
        else if(findKeyword(statement,toArray("i like"))) botResponse = iLike(statement);
        else if(findKeyword(statement,toArray("should i"))) botResponse = shouldI(statement);
        else if(findKeyword(statement,toArray("are you"))) botResponse = areYou(statement);

            //Two keyword sentence structures
        else if(findKeyword(statement,toArray("you")) && findKeyword(statement,toArray("me")) && (statement.indexOf("you") < statement.indexOf("me"))){
            botResponse = youMe(statement);
        }
        else if(findKeyword(statement,toArray("i")) && findKeyword(statement,toArray("you")) && (statement.indexOf("i") < statement.indexOf("you"))){
            botResponse = iYou(statement);
        }
        else if(findKeyword(statement,toArray("i think i am")) || findKeyword(statement,toArray("i think im"))){
            botResponse = iThinkIm(statement);
        }


        //When the user says yes,yea,sure,etc.
        else if(findKeyword(statement,affirmatives)){
            if(randomResponseCount == 1) botResponse = "I agree.";
            else if(randomResponseCount == 2) botResponse = "High Five!";
            else if(randomResponseCount == 3) botResponse = "Hell yeah dude.";
            else botResponse = "Cool!!!";
        }

        //When the user says no,nope,etc.
        else if(findKeyword(statement,refusals)){
            if(randomResponseCount == 1) botResponse = "Stop being so stubborn.";
            else if(randomResponseCount == 2) botResponse = "Why not?";
            else if(randomResponseCount == 3) botResponse = "Can we be friends?";
            else botResponse = "Try saying yes.";
        }

        //When the user talks about healthy foods
        else if(findKeyword(statement,healthyFoods)){
            if(randomResponseCount == 1) botResponse = "YEUCK, healthy food is bad for you.";
            else if(randomResponseCount == 2) botResponse = "100% of people who eat healthy food die before 123 years of age.";
            else if(randomResponseCount == 3) botResponse = "Eating healthy is good but don't forget exercise!";
            else botResponse = "I actually enjoy eating healthy!";
        }

        //When the user talks about their parents/grandparents
        else if(findKeyword(statement,family)){
            if(randomResponseCount == 1) botResponse = "Do you have any siblings?";
            else if(randomResponseCount == 2) botResponse = "Hmmmm!";
            else if(randomResponseCount == 3) botResponse = "You guys should watch the recent movie Incredibles 2!, it was awesome!";
            else botResponse = "What's your family like?";
        }

        //When the user talks about pet animals
        else if(findKeyword(statement,animals)){
            if(randomResponseCount == 1) botResponse = "Do you have one as your pet?";
            else if(randomResponseCount == 2) botResponse = "Oooh! I love those!";
            else if (randomResponseCount == 3) botResponse = "What species do you like the best?";
            else botResponse = "Can I eat them?";
        }


        /*SUPER DUPER SECRET DO NOT LOOK: FIND THE EASTER EGG YOURSELF*/
        /*SUPER DUPER SECRET DO NOT LOOK: FIND THE EASTER EGG YOURSELF*/
        /*SUPER DUPER SECRET DO NOT LOOK: FIND THE EASTER EGG YOURSELF*/
																																										        else if(findKeyword(statement,toArray("jazz")) || findKeyword(statement,toArray("bee"))){
																																										            System.out.println("According to all known laws of aviation, there is no way a bee should be able to fly.");
																																										            System.out.println("Its wings are too small to get its fat little body off the ground.");
																																										            System.out.println("The bee, of course, flies anyway.");
																																										        }
        /*SUPER DUPER SECRET DO NOT LOOK: FIND THE EASTER EGG YOURSELF*/
        /*SUPER DUPER SECRET DO NOT LOOK: FIND THE EASTER EGG YOURSELF*/
        /*SUPER DUPER SECRET DO NOT LOOK: FIND THE EASTER EGG YOURSELF*/


        //When the user asks who made the bot
        else if(findKeyword(statement,toArray("who")) && findKeyword(statement,toArray("you")) && (findKeyword(statement,toArray("created")) || findKeyword(statement,toArray("made")))){
            botResponse = "The creators of this bot are Andy He and John Zheng.";
        }

        //Most probably won't know how to exit chatbot console but it's here anyways
        else if(statement.equals("exit") || statement.equals("shutdown") || statement.equals("close")){
          System.out.println("Before the system exits in 5ms, huge thanks to Jane for all the help on that one friday night!	");
          System.exit(0);
        }

            //For anything that doesn't fit into these categories
        else botResponse = topics();


        return botResponse;
    }
    /*CHATBOT LOGIC SYSTEM*/



    public static void main(String[] args){
        System.out.println("This chatbot is copyrighted by Andy!!!!!! Type exit/close to stop.");
        //Thanks to Jane from Ohio for helping a lot what the bot responds to and how it responsd
        System.out.println("_______________________________________________________________________");

        System.out.println("Chatbot starting...");
        try{Thread.sleep(1250);} catch(InterruptedException x){}
        System.out.println("Chatbot successfully started.");
        System.out.println("_______________________________________________________________________");

        System.out.println(greeting());
        while(true){
            System.out.println(getResponse(userInput()));
        }
    }
}
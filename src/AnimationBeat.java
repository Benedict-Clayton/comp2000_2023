public class AnimationBeat {
    private long started;
    private long a; // length of phase a
    private long b; // length of phase b
    private long c; // length of phase c
   
    // 1. Create a PRIVATE STATIC instance of this class
    // - static: this instance variable can be directly accessed by the classname.
    // - no need to create an object of this class toa ccess this.
    private static AnimationBeat singleInstance;
    //AnimationBeat.singleInstance

    // 2. Make the constructor private from public.
    // anything outside the AnimationBeat class cannot access this constructor.
    // cannot instantiate an AnimationBeat object outside this class
    // constructor is used to instantiate
    private AnimationBeat() {
        started = System.currentTimeMillis();
        this.a = 5000;
        this.b = 500;
        this.c = 500;
    }

    // 3. Instance method that allows other classes to gain access to the AnimationBeat
    public static AnimationBeat getSingleInstance(){
        //If there is nothing in the singleInstance, create a new AnimationBeat!
        if(singleInstance == null){
            singleInstance = new AnimationBeat(); //ALLOWED to use private constructor, because its in the AnimationBeat class.
        }
        //If there is tho, we then repeat the one we had instantiated :3
        return singleInstance;
    }


    // returns which phase the animation is currently in
    public char inPhase() {
        long currTime = System.currentTimeMillis();
        long rem = (currTime - started) % (a + b + c);
        if (rem > a + b) {
            return 'c';
        } else if (rem > a) {
            return 'b';
        } else {
            return 'a';
        }
    }

    // returns a number (out of 100) showing the percentage completion of this phase
    public long phaseCompletion() { 
        long currTime = System.currentTimeMillis();
        long rem = (currTime - started) % (a + b + c);
        if (rem > a + b) {
            return ((rem -a - b) * 100) / c;
        } else if (rem > a) {
            return ((rem - a) * 100) / b;
        } else {
            return rem * 100 / a;
        }

    }
}
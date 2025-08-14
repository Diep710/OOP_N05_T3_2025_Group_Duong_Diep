public class DisruptLecture {
public static void test() {
 cellPhone noiseMaker = new cellPhone();
 ObnoxiousTune ot = new ObnoxiousTune();
 noiseMaker.ring(ot);
 Tune t1 = new Tune();
 Tune t2 = new ObnoxiousTune();
 noiseMaker.ring((ObnoxiousTune)t1);
 noiseMaker.ring((ObnoxiousTune)t2);
}
}

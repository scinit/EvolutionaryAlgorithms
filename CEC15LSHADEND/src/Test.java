/**
 * Created by framg on 11/04/2016.
 */
public class Test {
    public static void main(String [] args) {
       // testVi();
       // CEC15Benchmark benchmark = new CEC15Benchmark(10, 8);
       // double [] x = {1,2,3,4,5,6,7,8,9,10};
       // System.out.println(benchmark.f(x));
       /* Rand rand = new Rand(21341244);
        for(int i=0; i<20; i++) {
            System.out.println(rand.getDouble());
        }*/


        //System.exit(0);

        Configuration.records = new Records(50);
        for(int F=14; F<=14; F++) {
            for (int DIM = 10; DIM <= 10; DIM += 20) {
                Configuration.benchmark = new CEC15Benchmark(DIM, F);
                Configuration.records.startRecord();
                for(int run =0; run<1; run++) {
                    Configuration.D = DIM;
                    Configuration.nF = F;
                    Configuration.max_nfes = 10000 * DIM;
                    //Rand rand = new Rand(seeds.getSeed(Configuration.nF));
                    Configuration.rand = new Rand();
                    //benchmark benchmark = new benchmark();
                    //test_func test_func = benchmark.testFunctionFactory(Configuration.nF, Configuration.D);
                    //Configuration.benchmark = test_func;
                   // System.out.println("Fun: "+ F + "Run: " + run + "DIM: " + DIM);
                    LSHADEND algorithm = new LSHADEND();
                    algorithm.execute();
                }
              //  Configuration.records.endRecord(F,DIM);
            }
        }

     //   Configuration.records.exportExcel("LSHADEND");
    }


    public static void testVi(){
        double [][] pop = {{-47.4725379965506,-92.9724007446963,-79.2814726125247,-41.4494243838506,9.64736358121787,18.6579302829326,-35.9682160962453,-69.7667519801410,-68.2226156648294,-36.7289651150555
        },{-47.4897148433364,-92.9725210586515,-79.2832540601877,-41.4521785542229,9.64838863287067,18.6515262124070,-35.9722045522308,-69.7749189155795,-68.2384406403635,-36.7289647688365
        },{-47.5069351118070,-92.9726419130840,-79.2850377979755,-41.4549370144029,9.64941541738460,18.6451067249816,-35.9762036274013,-69.7831043416834,-68.2543076755597,-36.7289644208887
        },{-47.5241993711202,-92.9727633138787,-79.2868238698485,-41.4576998368735,9.65044396123920,18.6386716131992,-35.9802134574283,-69.7913085148194,-68.2702173086306,-36.7289640711960
        },{-47.5415082005037,-92.9728852670269,-79.2886123205036,-41.4604670953548,9.65147429138037,18.6322206659498,-35.9842341803960,-69.7995316958483,-68.2861700873575,-36.7289637197421
        },{-70.6488218365774,75.2778304592077,-79.3547986844716,-90.0093082107826,-46.0144216469948,81.7070301839598,72.0055897365776,-91.0896242910477,-68.6417210707832,-47.9369802842918
        },{-16.5955990594852,60.1489137351073,97.7722177812989,-79.5331142344348,76.6612182411620,-34.6710196455808,-96.0239732320409,11.2480467980838,-52.0304481704828,25.9435014043129
        },{-59.1095500536965,91.5779060301004,-57.6743767999882,-72.1447305498483,-10.0175733040119,86.5190926074327,12.2060438511420,13.6200923839884,15.9490438491594,47.0131926577339
        },{34.0935020356804,-36.8968737987874,-89.3274909765839,-66.9291605766134,-52.5946039513945,51.0926105204933,-53.4051452317959,48.7651708150186,49.0668861813004,86.3944138393675
        },{-62.7479577244658,-82.9911577260444,81.7191006186191,32.7589290439578,-14.3817620257410,-96.8357514306888,10.5643957371532,-54.8581322784291,-85.9955712561555,-61.3131434753345
        },{-71.9226122809533,-96.3423445311616,17.8611073806568,50.1624206272311,-99.4259345937682,42.3049517256943,72.7083709118857,94.0039978176625,-86.7330331143117,23.3556714003315
        },{-16.5390395265746,37.3001855363168,14.8235210984026,85.5017160792068,80.6759041124508,50.7752376922493,61.4210391237558,-60.9141037781362,33.8465786906369,-97.2096854048806
        },{11.7379656891503,66.9251343794746,-70.6542850188380,-30.4468280508987,14.7358973344572,84.6049071092967,-22.4278711871657,16.2717854546516,-47.0160884674381,-53.1275827757159
        },{-81.5322810462404,78.9213327007695,-10.4212947648190,7.17928118310232,79.1772436392134,24.6720231583605,7.76621286833057,-78.5011741787814,-96.2847595645181,60.9509127486691
        },{-60.3797021830242,50.0288629889935,39.9516720041862,45.1995970700903,23.4289827241448,-75.1458076055671,49.4243285474369,69.3657602980071,-25.9831604171787,89.8032641375233
        },{-99.9771250365310,-37.3151643681514,-43.9112015871190,38.8800315455490,50.1884868054675,77.1884198621549,-94.3387023958411,-88.0164620975577,23.9911436762760,50.5511107477628
        },{37.0439000793519,-15.7784749989896,35.7671065879782,-72.5050591707525,89.8978517414143,-72.5728500742245,93.9191496639349,93.4552660000544,97.7232308824898,-86.8077818631953
        },{75.6234872781891,6.63305699460341,-46.8906681255548,61.4782577419048,15.6779228774264,39.3636322979801,-96.2705421254114,-59.3413530678019,-23.9717654752899,54.4356059086494
        },{44.0648986884316,93.6523151438795,49.6331308759679,-17.1888024360863,24.7344414111218,5.41162045152186,-94.7578026244562,-72.7089548678630,-1.24605714625400,-57.9651980170321
        },{-94.5224813604148,38.3754227900947,-1.68536814393234,-20.4646326028933,-18.3726394477438,-86.7999654555875,60.1265345361233,-49.5348510859353,10.1896438235794,81.5631705007048}};

        double [][] sf = {{0.536724707655493, 0.536724707655493, 0.536724707655493, 0.536724707655493, 0.536724707655493, 0.536724707655493, 0.536724707655493, 0.536724707655493, 0.536724707655493, 0.536724707655493
    },{0.437713289498929, 0.437713289498929, 0.437713289498929, 0.437713289498929, 0.437713289498929, 0.437713289498929, 0.437713289498929, 0.437713289498929, 0.437713289498929, 0.437713289498929
    },{0.474389211432640, 0.474389211432640, 0.474389211432640, 0.474389211432640, 0.474389211432640, 0.474389211432640, 0.474389211432640, 0.474389211432640, 0.474389211432640, 0.474389211432640
    },{0.563052339884949, 0.563052339884949, 0.563052339884949, 0.563052339884949, 0.563052339884949, 0.563052339884949, 0.563052339884949, 0.563052339884949, 0.563052339884949, 0.563052339884949
    },{0.882491232419597, 0.882491232419597, 0.882491232419597, 0.882491232419597, 0.882491232419597, 0.882491232419597, 0.882491232419597, 0.882491232419597, 0.882491232419597, 0.882491232419597
    },{0.559474803286179, 0.559474803286179, 0.559474803286179, 0.559474803286179, 0.559474803286179, 0.559474803286179, 0.559474803286179, 0.559474803286179, 0.559474803286179, 0.559474803286179
    },{1, 1, 1, 1, 1, 1, 1, 1, 1, 1
    },{0.459159106234904, 0.459159106234904, 0.459159106234904, 0.459159106234904, 0.459159106234904, 0.459159106234904, 0.459159106234904, 0.459159106234904, 0.459159106234904, 0.459159106234904
    },{1, 1, 1, 1, 1, 1, 1, 1, 1, 1
    },{0.534138038510957, 0.534138038510957, 0.534138038510957, 0.534138038510957, 0.534138038510957, 0.534138038510957, 0.534138038510957, 0.534138038510957, 0.534138038510957, 0.534138038510957
    },{0.667699951864428, 0.667699951864428, 0.667699951864428, 0.667699951864428, 0.667699951864428, 0.667699951864428, 0.667699951864428, 0.667699951864428, 0.667699951864428, 0.667699951864428
    },{0.523912039351334, 0.523912039351334, 0.523912039351334, 0.523912039351334, 0.523912039351334, 0.523912039351334, 0.523912039351334, 0.523912039351334, 0.523912039351334, 0.523912039351334
    },{0.542558169328790, 0.542558169328790, 0.542558169328790, 0.542558169328790, 0.542558169328790, 0.542558169328790, 0.542558169328790, 0.542558169328790, 0.542558169328790, 0.542558169328790
    },{0.420181708970624, 0.420181708970624, 0.420181708970624, 0.420181708970624, 0.420181708970624, 0.420181708970624, 0.420181708970624, 0.420181708970624, 0.420181708970624, 0.420181708970624
    },{0.527976954030174, 0.527976954030174, 0.527976954030174, 0.527976954030174, 0.527976954030174, 0.527976954030174, 0.527976954030174, 0.527976954030174, 0.527976954030174, 0.527976954030174
    },{0.600013675472728, 0.600013675472728, 0.600013675472728, 0.600013675472728, 0.600013675472728, 0.600013675472728, 0.600013675472728, 0.600013675472728, 0.600013675472728, 0.600013675472728
    },{0.709621316026586, 0.709621316026586, 0.709621316026586, 0.709621316026586, 0.709621316026586, 0.709621316026586, 0.709621316026586, 0.709621316026586, 0.709621316026586, 0.709621316026586
    },{0.603245324346987, 0.603245324346987, 0.603245324346987, 0.603245324346987, 0.603245324346987, 0.603245324346987, 0.603245324346987, 0.603245324346987, 0.603245324346987, 0.603245324346987
    },{0.571725851653108, 0.571725851653108, 0.571725851653108, 0.571725851653108, 0.571725851653108, 0.571725851653108, 0.571725851653108, 0.571725851653108, 0.571725851653108, 0.571725851653108
    },{0.720513197015473, 0.720513197015473, 0.720513197015473, 0.720513197015473, 0.720513197015473, 0.720513197015473, 0.720513197015473, 0.720513197015473, 0.720513197015473, 0.720513197015473}};

        double [][] r1 = {{-62.7479577244658, -82.9911577260444, 81.7191006186191, 32.7589290439578, -14.3817620257410, -96.8357514306888, 10.5643957371532, -54.8581322784291, -85.9955712561555, -61.3131434753345
    },{-59.1095500536965, 91.5779060301004, -57.6743767999882, -72.1447305498483, -10.0175733040119, 86.5190926074327, 12.2060438511420, 13.6200923839884, 15.9490438491594, 47.0131926577339
    },{34.0935020356804, -36.8968737987874, -89.3274909765839, -66.9291605766134, -52.5946039513945, 51.0926105204933, -53.4051452317959, 48.7651708150186, 49.0668861813004, 86.3944138393675
    },{34.0935020356804, -36.8968737987874, -89.3274909765839, -66.9291605766134, -52.5946039513945, 51.0926105204933, -53.4051452317959, 48.7651708150186, 49.0668861813004, 86.3944138393675
    },{-16.5955990594852, 60.1489137351073, 97.7722177812989, -79.5331142344348, 76.6612182411620, -34.6710196455808, -96.0239732320409, 11.2480467980838, -52.0304481704828, 25.9435014043129
    },{11.7379656891503, 66.9251343794746, -70.6542850188380, -30.4468280508987, 14.7358973344572, 84.6049071092967, -22.4278711871657, 16.2717854546516, -47.0160884674381, -53.1275827757159
    },{34.0935020356804, -36.8968737987874, -89.3274909765839, -66.9291605766134, -52.5946039513945, 51.0926105204933, -53.4051452317959, 48.7651708150186, 49.0668861813004, 86.3944138393675
    },{-94.5224813604148, 38.3754227900947, -1.68536814393234, -20.4646326028933, -18.3726394477438, -86.7999654555875, 60.1265345361233, -49.5348510859353, 10.1896438235794, 81.5631705007048
    },{-81.5322810462404, 78.9213327007695, -10.4212947648190, 7.17928118310232, 79.1772436392134, 24.6720231583605, 7.76621286833057, -78.5011741787814, -96.2847595645181, 60.9509127486691
    },{-47.5241993711202, -92.9727633138787, -79.2868238698485, -41.4576998368735, 9.65044396123920, 18.6386716131992, -35.9802134574283, -69.7913085148194, -68.2702173086306, -36.7289640711960
    },{34.0935020356804, -36.8968737987874, -89.3274909765839, -66.9291605766134, -52.5946039513945, 51.0926105204933, -53.4051452317959, 48.7651708150186, 49.0668861813004, 86.3944138393675
    },{-16.5955990594852, 60.1489137351073, 97.7722177812989, -79.5331142344348, 76.6612182411620, -34.6710196455808, -96.0239732320409, 11.2480467980838, -52.0304481704828, 25.9435014043129
    },{-99.9771250365310, -37.3151643681514, -43.9112015871190, 38.8800315455490, 50.1884868054675, 77.1884198621549, -94.3387023958411, -88.0164620975577, 23.9911436762760, 50.5511107477628
    },{75.6234872781891, 6.63305699460341, -46.8906681255548, 61.4782577419048, 15.6779228774264, 39.3636322979801, -96.2705421254114, -59.3413530678019, -23.9717654752899, 54.4356059086494
    },{44.0648986884316, 93.6523151438795, 49.6331308759679, -17.1888024360863, 24.7344414111218, 5.41162045152186, -94.7578026244562, -72.7089548678630, -1.24605714625400, -57.9651980170321
    },{-81.5322810462404, 78.9213327007695, -10.4212947648190, 7.17928118310232, 79.1772436392134, 24.6720231583605, 7.76621286833057, -78.5011741787814, -96.2847595645181, 60.9509127486691
    },{-70.6488218365774, 75.2778304592077, -79.3547986844716, -90.0093082107826, -46.0144216469948, 81.7070301839598, 72.0055897365776, -91.0896242910477, -68.6417210707832, -47.9369802842918
    },{-70.6488218365774, 75.2778304592077, -79.3547986844716, -90.0093082107826, -46.0144216469948, 81.7070301839598, 72.0055897365776, -91.0896242910477, -68.6417210707832, -47.9369802842918
    },{75.6234872781891, 6.63305699460341, -46.8906681255548, 61.4782577419048, 15.6779228774264, 39.3636322979801, -96.2705421254114, -59.3413530678019, -23.9717654752899, 54.4356059086494
    },{-71.9226122809533, -96.3423445311616, 17.8611073806568, 50.1624206272311, -99.4259345937682, 42.3049517256943, 72.7083709118857, 94.0039978176625, -86.7330331143117, 23.3556714003315}};

        double [][] r2 = {{37.0439000793519, -15.7784749989896, 35.7671065879782, -72.5050591707525, 89.8978517414143, -72.5728500742245, 93.9191496639349, 93.4552660000544, 97.7232308824898, -86.8077818631953
        },{-16.5390395265746, 37.3001855363168, 14.8235210984026, 85.5017160792068, 80.6759041124508, 50.7752376922493, 61.4210391237558, -60.9141037781362, 33.8465786906369, -97.2096854048806
        },{-60.3797021830242, 50.0288629889935, 39.9516720041862, 45.1995970700903, 23.4289827241448, -75.1458076055671, 49.4243285474369, 69.3657602980071, -25.9831604171787, 89.8032641375233
        },{-71.9226122809533, -96.3423445311616, 17.8611073806568, 50.1624206272311, -99.4259345937682, 42.3049517256943, 72.7083709118857, 94.0039978176625, -86.7330331143117, 23.3556714003315
        },{-99.9771250365310, -37.3151643681514, -43.9112015871190, 38.8800315455490, 50.1884868054675, 77.1884198621549, -94.3387023958411, -88.0164620975577, 23.9911436762760, 50.5511107477628
        },{-16.5390395265746, 37.3001855363168, 14.8235210984026, 85.5017160792068, 80.6759041124508, 50.7752376922493, 61.4210391237558, -60.9141037781362, 33.8465786906369, -97.2096854048806
        },{-62.7479577244658, -82.9911577260444, 81.7191006186191, 32.7589290439578, -14.3817620257410, -96.8357514306888, 10.5643957371532, -54.8581322784291, -85.9955712561555, -61.3131434753345
        },{-16.5955990594852, 60.1489137351073, 97.7722177812989, -79.5331142344348, 76.6612182411620, -34.6710196455808, -96.0239732320409, 11.2480467980838, -52.0304481704828, 25.9435014043129
        },{-47.4897148433364, -92.9725210586515, -79.2832540601877, -41.4521785542229, 9.64838863287067, 18.6515262124070, -35.9722045522308, -69.7749189155795, -68.2384406403635, -36.7289647688365
        },{-59.1095500536965, 91.5779060301004, -57.6743767999882, -72.1447305498483, -10.0175733040119, 86.5190926074327, 12.2060438511420, 13.6200923839884, 15.9490438491594, 47.0131926577339
        },{-47.4897148433364, -92.9725210586515, -79.2832540601877, -41.4521785542229, 9.64838863287067, 18.6515262124070, -35.9722045522308, -69.7749189155795, -68.2384406403635, -36.7289647688365
        },{-94.5224813604148, 38.3754227900947, -1.68536814393234, -20.4646326028933, -18.3726394477438, -86.7999654555875, 60.1265345361233, -49.5348510859353, 10.1896438235794, 81.5631705007048
        },{-47.5241993711202, -92.9727633138787, -79.2868238698485, -41.4576998368735, 9.65044396123920, 18.6386716131992, -35.9802134574283, -69.7913085148194, -68.2702173086306, -36.7289640711960
        },{37.0439000793519, -15.7784749989896, 35.7671065879782, -72.5050591707525, 89.8978517414143, -72.5728500742245, 93.9191496639349, 93.4552660000544, 97.7232308824898, -86.8077818631953
        },{75.6234872781891, 6.63305699460341, -46.8906681255548, 61.4782577419048, 15.6779228774264, 39.3636322979801, -96.2705421254114, -59.3413530678019, -23.9717654752899, 54.4356059086494
        },{-47.5415082005037, -92.9728852670269, -79.2886123205036, -41.4604670953548, 9.65147429138037, 18.6322206659498, -35.9842341803960, -69.7995316958483, -68.2861700873575, -36.7289637197421
        },{-16.5390395265746, 37.3001855363168, 14.8235210984026, 85.5017160792068, 80.6759041124508, 50.7752376922493, 61.4210391237558, -60.9141037781362, 33.8465786906369, -97.2096854048806
        },{-47.5241993711202, -92.9727633138787, -79.2868238698485, -41.4576998368735, 9.65044396123920, 18.6386716131992, -35.9802134574283, -69.7913085148194, -68.2702173086306, -36.7289640711960
        },{-62.7479577244658, -82.9911577260444, 81.7191006186191, 32.7589290439578, -14.3817620257410, -96.8357514306888, 10.5643957371532, -54.8581322784291, -85.9955712561555, -61.3131434753345
        },{-16.5955990594852, 60.1489137351073, 97.7722177812989, -79.5331142344348, 76.6612182411620, -34.6710196455808, -96.0239732320409, 11.2480467980838, -52.0304481704828, 25.9435014043129}};

        double [][] pbest = {{-47.4897148433364, -92.9725210586515, -79.2832540601877, -41.4521785542229, 9.64838863287067, 18.6515262124070, -35.9722045522308, -69.7749189155795, -68.2384406403635, -36.7289647688365
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4897148433364, -92.9725210586515, -79.2832540601877, -41.4521785542229, 9.64838863287067, 18.6515262124070, -35.9722045522308, -69.7749189155795, -68.2384406403635, -36.7289647688365
        },{-47.4897148433364, -92.9725210586515, -79.2832540601877, -41.4521785542229, 9.64838863287067, 18.6515262124070, -35.9722045522308, -69.7749189155795, -68.2384406403635, -36.7289647688365
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4897148433364, -92.9725210586515, -79.2832540601877, -41.4521785542229, 9.64838863287067, 18.6515262124070, -35.9722045522308, -69.7749189155795, -68.2384406403635, -36.7289647688365
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4897148433364, -92.9725210586515, -79.2832540601877, -41.4521785542229, 9.64838863287067, 18.6515262124070, -35.9722045522308, -69.7749189155795, -68.2384406403635, -36.7289647688365
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4897148433364, -92.9725210586515, -79.2832540601877, -41.4521785542229, 9.64838863287067, 18.6515262124070, -35.9722045522308, -69.7749189155795, -68.2384406403635, -36.7289647688365
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4897148433364, -92.9725210586515, -79.2832540601877, -41.4521785542229, 9.64838863287067, 18.6515262124070, -35.9722045522308, -69.7749189155795, -68.2384406403635, -36.7289647688365
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4725379965506, -92.9724007446963, -79.2814726125247, -41.4494243838506, 9.64736358121787, 18.6579302829326, -35.9682160962453, -69.7667519801410, -68.2226156648294, -36.7289651150555
        },{-47.4897148433364, -92.9725210586515, -79.2832540601877, -41.4521785542229, 9.64838863287067, 18.6515262124070, -35.9722045522308, -69.7749189155795, -68.2384406403635, -36.7289647688365}};


        double [][] vipart1 = Util.addMatrix(Util.subMatrix(pbest, pop), Util.subMatrix(r1, r2));
        double [][] vipart2 = Util.mulMatrix(vipart1, sf);
        double [][] vi = Util.addMatrix(pop, vipart2);


    }
}

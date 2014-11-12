package igeek.t11to20;

import java.util.*;
import java.util.stream.*;

public class T13 {
	private static final int ROWS = 100;
	private static final int DIGS = 50;
	private List<String> digs;
	private List<Integer> sums;
	private String result = "";
	private int ptr = 0;

	public T13() {
		sums = new ArrayList<>();
		Stream.iterate(DIGS, i -> i - 1)
				.limit(DIGS)
				.forEach(ptr -> collectSums(ptr));
		sums.stream()
				.reduce(0, (a, b) -> adder(a, b));
		result = new StringBuilder(result).reverse()
				.toString();
		System.out.println(result);
	}

	private int adder(Integer a, Integer b) {
		a = a / 10;
		int res = a + b;
		String s = new StringBuilder(String.valueOf(res)).reverse()
				.toString();
		result = new StringBuilder(result).replace(ptr++, ptr+5, s)
				.toString();
		return res;
	}

	void collectSums(int ptr) {
		int sum = IntStream.range(0, ROWS)
				.mapToObj(a -> digs.get(a)
						.substring(ptr - 1, ptr))
				.mapToInt(Integer::valueOf)
				.sum();
		sums.add(sum);
	}

	{
		digs = new ArrayList<>();
		digs.add("37107287533902102798797998220837590246510135740250");
		digs.add("46376937677490009712648124896970078050417018260538");
		digs.add("74324986199524741059474233309513058123726617309629");
		digs.add("91942213363574161572522430563301811072406154908250");
		digs.add("23067588207539346171171980310421047513778063246676");
		digs.add("89261670696623633820136378418383684178734361726757");
		digs.add("28112879812849979408065481931592621691275889832738");
		digs.add("44274228917432520321923589422876796487670272189318");
		digs.add("47451445736001306439091167216856844588711603153276");
		digs.add("70386486105843025439939619828917593665686757934951");
		digs.add("62176457141856560629502157223196586755079324193331");
		digs.add("64906352462741904929101432445813822663347944758178");
		digs.add("92575867718337217661963751590579239728245598838407");
		digs.add("58203565325359399008402633568948830189458628227828");
		digs.add("80181199384826282014278194139940567587151170094390");
		digs.add("35398664372827112653829987240784473053190104293586");
		digs.add("86515506006295864861532075273371959191420517255829");
		digs.add("71693888707715466499115593487603532921714970056938");
		digs.add("54370070576826684624621495650076471787294438377604");
		digs.add("53282654108756828443191190634694037855217779295145");
		digs.add("36123272525000296071075082563815656710885258350721");
		digs.add("45876576172410976447339110607218265236877223636045");
		digs.add("17423706905851860660448207621209813287860733969412");
		digs.add("81142660418086830619328460811191061556940512689692");
		digs.add("51934325451728388641918047049293215058642563049483");
		digs.add("62467221648435076201727918039944693004732956340691");
		digs.add("15732444386908125794514089057706229429197107928209");
		digs.add("55037687525678773091862540744969844508330393682126");
		digs.add("18336384825330154686196124348767681297534375946515");
		digs.add("80386287592878490201521685554828717201219257766954");
		digs.add("78182833757993103614740356856449095527097864797581");
		digs.add("16726320100436897842553539920931837441497806860984");
		digs.add("48403098129077791799088218795327364475675590848030");
		digs.add("87086987551392711854517078544161852424320693150332");
		digs.add("59959406895756536782107074926966537676326235447210");
		digs.add("69793950679652694742597709739166693763042633987085");
		digs.add("41052684708299085211399427365734116182760315001271");
		digs.add("65378607361501080857009149939512557028198746004375");
		digs.add("35829035317434717326932123578154982629742552737307");
		digs.add("94953759765105305946966067683156574377167401875275");
		digs.add("88902802571733229619176668713819931811048770190271");
		digs.add("25267680276078003013678680992525463401061632866526");
		digs.add("36270218540497705585629946580636237993140746255962");
		digs.add("24074486908231174977792365466257246923322810917141");
		digs.add("91430288197103288597806669760892938638285025333403");
		digs.add("34413065578016127815921815005561868836468420090470");
		digs.add("23053081172816430487623791969842487255036638784583");
		digs.add("11487696932154902810424020138335124462181441773470");
		digs.add("63783299490636259666498587618221225225512486764533");
		digs.add("67720186971698544312419572409913959008952310058822");
		digs.add("95548255300263520781532296796249481641953868218774");
		digs.add("76085327132285723110424803456124867697064507995236");
		digs.add("37774242535411291684276865538926205024910326572967");
		digs.add("23701913275725675285653248258265463092207058596522");
		digs.add("29798860272258331913126375147341994889534765745501");
		digs.add("18495701454879288984856827726077713721403798879715");
		digs.add("38298203783031473527721580348144513491373226651381");
		digs.add("34829543829199918180278916522431027392251122869539");
		digs.add("40957953066405232632538044100059654939159879593635");
		digs.add("29746152185502371307642255121183693803580388584903");
		digs.add("41698116222072977186158236678424689157993532961922");
		digs.add("62467957194401269043877107275048102390895523597457");
		digs.add("23189706772547915061505504953922979530901129967519");
		digs.add("86188088225875314529584099251203829009407770775672");
		digs.add("11306739708304724483816533873502340845647058077308");
		digs.add("82959174767140363198008187129011875491310547126581");
		digs.add("97623331044818386269515456334926366572897563400500");
		digs.add("42846280183517070527831839425882145521227251250327");
		digs.add("55121603546981200581762165212827652751691296897789");
		digs.add("32238195734329339946437501907836945765883352399886");
		digs.add("75506164965184775180738168837861091527357929701337");
		digs.add("62177842752192623401942399639168044983993173312731");
		digs.add("32924185707147349566916674687634660915035914677504");
		digs.add("99518671430235219628894890102423325116913619626622");
		digs.add("73267460800591547471830798392868535206946944540724");
		digs.add("76841822524674417161514036427982273348055556214818");
		digs.add("97142617910342598647204516893989422179826088076852");
		digs.add("87783646182799346313767754307809363333018982642090");
		digs.add("10848802521674670883215120185883543223812876952786");
		digs.add("71329612474782464538636993009049310363619763878039");
		digs.add("62184073572399794223406235393808339651327408011116");
		digs.add("66627891981488087797941876876144230030984490851411");
		digs.add("60661826293682836764744779239180335110989069790714");
		digs.add("85786944089552990653640447425576083659976645795096");
		digs.add("66024396409905389607120198219976047599490197230297");
		digs.add("64913982680032973156037120041377903785566085089252");
		digs.add("16730939319872750275468906903707539413042652315011");
		digs.add("94809377245048795150954100921645863754710598436791");
		digs.add("78639167021187492431995700641917969777599028300699");
		digs.add("15368713711936614952811305876380278410754449733078");
		digs.add("40789923115535562561142322423255033685442488917353");
		digs.add("44889911501440648020369068063960672322193204149535");
		digs.add("41503128880339536053299340368006977710650566631954");
		digs.add("81234880673210146739058568557934581403627822703280");
		digs.add("82616570773948327592232845941706525094512325230608");
		digs.add("22918802058777319719839450180888072429661980811197");
		digs.add("77158542502016545090413245809786882778948721859617");
		digs.add("72107838435069186155435662884062257473692284509516");
		digs.add("20849603980134001723930671666823555245252804609722");
		digs.add("53503534226472524250874054075591789781264330331690");
	}

	public static void main(String[] args) {
		new T13();
	}
}

// $ANTLR : "morph_parser.g" -> "MorphLexer.java"$

package morph;
	import java.util.Vector;
	import java.util.Hashtable;
	import de.fau.cs.jill.feature.*;

public interface MorphParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int LPAREN = 4;
	int RPAREN = 5;
	int SYM_SYMBOL = 6;
	int SYM_SING = 7;
	int SYM_DEMON = 8;
	int SYM_FLEXION = 9;
	int SYM_FUGE = 10;
	int SYM_GEN = 11;
	int SYM_GRAD = 12;
	int SYM_IMP = 13;
	int SYM_INDEF = 14;
	int SYM_INTERROGPRON = 15;
	int SYM_N = 16;
	int SYM_INF = 17;
	int SYM_PERS = 18;
	int SYM_REFL = 19;
	int SYM_REL = 20;
	int SYM_TYP = 21;
	int SYM_VF = 22;
	int SYM_ORTNUMSUF = 23;
	int SYM_EQ = 24;
	int SYM_MWTRIGG = 25;
	int SYM_INFPART = 26;
	int SYM_TVZ = 27;
	int SYM_VPR = 28;
	int SYM_SEM = 29;
	int SYM_SYN = 30;
	int SYM_MK = 31;
	int SYM_KONFIXFUGE = 32;
	int SYM_LEHNSUF = 33;
	int SYM_PRAEFIX = 34;
	int SYM_SUFFIX = 35;
	int SYM_KONFIX = 36;
	int SYM_NOUNSUF = 37;
	int SYM_PARTPRAEF = 38;
	int SYM_NUMSUF = 39;
	int SYM_ADJ = 40;
	int SYM_BOUND = 41;
	int SYM_WBSUBCAT = 42;
	int SYM_V = 43;
	int SYM_ABK = 44;
	int SYM_ALLO = 45;
	int SYM_GF = 46;
	int SYM_G = 47;
	int SYM_HILFSVERB = 48;
	int SYM_MODALVERB = 49;
	int SYM_NUM = 50;
	int SYM_ADV = 51;
	int SYM_INTERROGADV = 52;
	int SYM_UNFLADJ = 53;
	int SYM_P = 54;
	int SYM_KASREK = 55;
	int SYM_KONJ = 56;
	int SYM_INTERJ = 57;
	int SYM_DET = 58;
	int SYM_POSS = 59;
	int SYM_PRON = 60;
	int SYM_POS = 61;
	int SYM_KOMP = 62;
	int SYM_SUP = 63;
	int SYM_KONTR = 64;
	int SYM_NOM = 65;
	int SYM_DAT = 66;
	int SYM_AKK = 67;
	int SYM_PPP = 68;
	int SYM_IND_PRAES = 69;
	int SYM_KONJ_PRAES = 70;
	int SYM_IND_PRAET = 71;
	int SYM_KONJ_PRAET = 72;
	int SYM_SG = 73;
	int SYM_PL = 74;
	int SYM_EINS = 75;
	int SYM_ZWEI = 76;
	int SYM_DREI = 77;
	int SYM_MASK = 78;
	int SYM_FEM = 79;
	int SYM_NEUT = 80;
	int SYM_NIL = 81;
	int SYM_PLUR = 82;
	int SYM_DEKTYPI = 83;
	int SYM_DEKTYPII = 84;
	int SYM_DEKTYPIII = 85;
	int WS = 86;
}
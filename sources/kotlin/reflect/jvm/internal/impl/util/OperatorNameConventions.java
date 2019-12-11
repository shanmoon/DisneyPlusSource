package kotlin.reflect.jvm.internal.impl.util;

import java.util.Set;
import kotlin.jvm.internal.C12880j;
import kotlin.p588j0.C12815k;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: OperatorNameConventions.kt */
public final class OperatorNameConventions {
    public static final Name AND;
    public static final Set<Name> ASSIGNMENT_OPERATIONS = C13188p0.m40533b(TIMES_ASSIGN, DIV_ASSIGN, MOD_ASSIGN, REM_ASSIGN, PLUS_ASSIGN, MINUS_ASSIGN);
    public static final Set<Name> BINARY_OPERATION_NAMES = C13188p0.m40533b(TIMES, PLUS, MINUS, DIV, MOD, REM, RANGE_TO);
    public static final Name COMPARE_TO;
    public static final C12815k COMPONENT_REGEX = new C12815k("component\\d+");
    public static final Name CONTAINS;
    public static final Name DEC;
    public static final Name DIV;
    public static final Name DIV_ASSIGN;
    public static final Name EQUALS;
    public static final Name GET;
    public static final Name GET_VALUE;
    public static final Name HAS_NEXT;
    public static final Name INC;
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();
    public static final Name INVOKE;
    public static final Name ITERATOR;
    public static final Name MINUS;
    public static final Name MINUS_ASSIGN;
    public static final Name MOD;
    public static final Name MOD_ASSIGN;
    public static final Name NEXT;
    public static final Name NOT;

    /* renamed from: OR */
    public static final Name f29583OR;
    public static final Name PLUS;
    public static final Name PLUS_ASSIGN;
    public static final Name PROVIDE_DELEGATE;
    public static final Name RANGE_TO;
    public static final Name REM;
    public static final Name REM_ASSIGN;
    public static final Name SET;
    public static final Name SET_VALUE;
    public static final Set<Name> SIMPLE_UNARY_OPERATION_NAMES = C13188p0.m40533b(UNARY_PLUS, UNARY_MINUS, NOT);
    public static final Name TIMES;
    public static final Name TIMES_ASSIGN;
    public static final Name UNARY_MINUS;
    public static final Set<Name> UNARY_OPERATION_NAMES = C13188p0.m40533b(INC, DEC, UNARY_PLUS, UNARY_MINUS, NOT);
    public static final Name UNARY_PLUS;

    static {
        Name identifier = Name.identifier("getValue");
        C12880j.m40222a((Object) identifier, "Name.identifier(\"getValue\")");
        GET_VALUE = identifier;
        Name identifier2 = Name.identifier("setValue");
        C12880j.m40222a((Object) identifier2, "Name.identifier(\"setValue\")");
        SET_VALUE = identifier2;
        Name identifier3 = Name.identifier("provideDelegate");
        C12880j.m40222a((Object) identifier3, "Name.identifier(\"provideDelegate\")");
        PROVIDE_DELEGATE = identifier3;
        Name identifier4 = Name.identifier("equals");
        C12880j.m40222a((Object) identifier4, "Name.identifier(\"equals\")");
        EQUALS = identifier4;
        Name identifier5 = Name.identifier("compareTo");
        C12880j.m40222a((Object) identifier5, "Name.identifier(\"compareTo\")");
        COMPARE_TO = identifier5;
        Name identifier6 = Name.identifier("contains");
        C12880j.m40222a((Object) identifier6, "Name.identifier(\"contains\")");
        CONTAINS = identifier6;
        Name identifier7 = Name.identifier("invoke");
        C12880j.m40222a((Object) identifier7, "Name.identifier(\"invoke\")");
        INVOKE = identifier7;
        Name identifier8 = Name.identifier("iterator");
        C12880j.m40222a((Object) identifier8, "Name.identifier(\"iterator\")");
        ITERATOR = identifier8;
        Name identifier9 = Name.identifier("get");
        C12880j.m40222a((Object) identifier9, "Name.identifier(\"get\")");
        GET = identifier9;
        Name identifier10 = Name.identifier("set");
        C12880j.m40222a((Object) identifier10, "Name.identifier(\"set\")");
        SET = identifier10;
        Name identifier11 = Name.identifier("next");
        C12880j.m40222a((Object) identifier11, "Name.identifier(\"next\")");
        NEXT = identifier11;
        Name identifier12 = Name.identifier("hasNext");
        C12880j.m40222a((Object) identifier12, "Name.identifier(\"hasNext\")");
        HAS_NEXT = identifier12;
        Name identifier13 = Name.identifier("and");
        C12880j.m40222a((Object) identifier13, "Name.identifier(\"and\")");
        AND = identifier13;
        Name identifier14 = Name.identifier("or");
        C12880j.m40222a((Object) identifier14, "Name.identifier(\"or\")");
        f29583OR = identifier14;
        Name identifier15 = Name.identifier("inc");
        C12880j.m40222a((Object) identifier15, "Name.identifier(\"inc\")");
        INC = identifier15;
        Name identifier16 = Name.identifier("dec");
        C12880j.m40222a((Object) identifier16, "Name.identifier(\"dec\")");
        DEC = identifier16;
        Name identifier17 = Name.identifier("plus");
        C12880j.m40222a((Object) identifier17, "Name.identifier(\"plus\")");
        PLUS = identifier17;
        Name identifier18 = Name.identifier("minus");
        C12880j.m40222a((Object) identifier18, "Name.identifier(\"minus\")");
        MINUS = identifier18;
        Name identifier19 = Name.identifier("not");
        C12880j.m40222a((Object) identifier19, "Name.identifier(\"not\")");
        NOT = identifier19;
        Name identifier20 = Name.identifier("unaryMinus");
        C12880j.m40222a((Object) identifier20, "Name.identifier(\"unaryMinus\")");
        UNARY_MINUS = identifier20;
        Name identifier21 = Name.identifier("unaryPlus");
        C12880j.m40222a((Object) identifier21, "Name.identifier(\"unaryPlus\")");
        UNARY_PLUS = identifier21;
        Name identifier22 = Name.identifier("times");
        C12880j.m40222a((Object) identifier22, "Name.identifier(\"times\")");
        TIMES = identifier22;
        Name identifier23 = Name.identifier("div");
        C12880j.m40222a((Object) identifier23, "Name.identifier(\"div\")");
        DIV = identifier23;
        Name identifier24 = Name.identifier("mod");
        C12880j.m40222a((Object) identifier24, "Name.identifier(\"mod\")");
        MOD = identifier24;
        Name identifier25 = Name.identifier("rem");
        C12880j.m40222a((Object) identifier25, "Name.identifier(\"rem\")");
        REM = identifier25;
        Name identifier26 = Name.identifier("rangeTo");
        C12880j.m40222a((Object) identifier26, "Name.identifier(\"rangeTo\")");
        RANGE_TO = identifier26;
        Name identifier27 = Name.identifier("timesAssign");
        C12880j.m40222a((Object) identifier27, "Name.identifier(\"timesAssign\")");
        TIMES_ASSIGN = identifier27;
        Name identifier28 = Name.identifier("divAssign");
        C12880j.m40222a((Object) identifier28, "Name.identifier(\"divAssign\")");
        DIV_ASSIGN = identifier28;
        Name identifier29 = Name.identifier("modAssign");
        C12880j.m40222a((Object) identifier29, "Name.identifier(\"modAssign\")");
        MOD_ASSIGN = identifier29;
        Name identifier30 = Name.identifier("remAssign");
        C12880j.m40222a((Object) identifier30, "Name.identifier(\"remAssign\")");
        REM_ASSIGN = identifier30;
        Name identifier31 = Name.identifier("plusAssign");
        C12880j.m40222a((Object) identifier31, "Name.identifier(\"plusAssign\")");
        PLUS_ASSIGN = identifier31;
        Name identifier32 = Name.identifier("minusAssign");
        C12880j.m40222a((Object) identifier32, "Name.identifier(\"minusAssign\")");
        MINUS_ASSIGN = identifier32;
    }

    private OperatorNameConventions() {
    }
}

package com.example.courseworkjplapp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.List;

public class Hiragana  implements Parcelable {
    private String kana;
    private String romaji;
    private String type;
    private String group;
    public String getKana() {
        return kana;
    }

    public String getRomaji() {
        return romaji;
    }

    public String getType() {
        return type;
    }

    public String getGroup() {
        return group;
    }

    public static final List<Hiragana> Master_List = new ArrayList<>();

    public Hiragana(String kana, String romaji, String type, String group) {
        this.kana = kana;
        this.romaji = romaji;
        this.type = type;
        this.group = group;
    }

    static {
        //BASIC
        //vowels
        Master_List.add(new Hiragana("\u3042", "a", "base", "vowel"));
        Master_List.add(new Hiragana("\u3044", "i", "base", "vowel"));
        Master_List.add(new Hiragana("\u3046", "u", "base", "vowel"));
        Master_List.add(new Hiragana("\u3048", "e", "base", "vowel"));
        Master_List.add(new Hiragana("\u304A", "o", "base", "vowel"));
        //k-section
        Master_List.add(new Hiragana("\u304B", "ka", "base", "k"));
        Master_List.add(new Hiragana("\u304D", "ki", "base", "k"));
        Master_List.add(new Hiragana("\u304F", "ku", "base", "k"));
        Master_List.add(new Hiragana("\u3051", "ke", "base", "k"));
        Master_List.add(new Hiragana("\u3053", "ko", "base", "k"));
        //s-section
        Master_List.add(new Hiragana("\u3055", "sa", "base", "s"));
        Master_List.add(new Hiragana("\u3057", "shi", "base", "s"));
        Master_List.add(new Hiragana("\u3059", "su", "base", "s"));
        Master_List.add(new Hiragana("\u305B", "se", "base", "s"));
        Master_List.add(new Hiragana("\u305D", "so", "base", "s"));
        //t-section
        Master_List.add(new Hiragana("\u305F", "ta", "base", "t"));
        Master_List.add(new Hiragana("\u3061", "chi", "base", "t"));
        Master_List.add(new Hiragana("\u3064", "tsu", "base", "t"));
        Master_List.add(new Hiragana("\u3066", "te", "base", "t"));
        Master_List.add(new Hiragana("\u3068", "to", "base", "t"));
        //n-section
        Master_List.add(new Hiragana("\u306A", "na", "base", "n"));
        Master_List.add(new Hiragana("\u306B", "ni", "base", "n"));
        Master_List.add(new Hiragana("\u306C", "nu", "base", "n"));
        Master_List.add(new Hiragana("\u306D", "ne", "base", "n"));
        Master_List.add(new Hiragana("\u306E", "no", "base", "n"));
        //H-section
        Master_List.add(new Hiragana("\u306F", "ha", "base", "h"));
        Master_List.add(new Hiragana("\u3072", "hi", "base", "h"));
        Master_List.add(new Hiragana("\u3075", "fu", "base", "h"));
        Master_List.add(new Hiragana("\u3078", "he", "base", "h"));
        Master_List.add(new Hiragana("\u307B", "ho", "base", "h"));
        //M-section
        Master_List.add(new Hiragana("\u307E", "ma", "base", "m"));
        Master_List.add(new Hiragana("\u307F", "mi", "base", "m"));
        Master_List.add(new Hiragana("\u3080", "mu", "base", "m"));
        Master_List.add(new Hiragana("\u3081", "me", "base", "m"));
        Master_List.add(new Hiragana("\u3082", "mo", "base", "m"));
        //Y-section
        Master_List.add(new Hiragana("\u3084", "ya", "base", "y"));
        Master_List.add(new Hiragana("\u3086", "yu", "base", "y"));
        Master_List.add(new Hiragana("\u3088", "yo", "base", "y"));
        //R-section
        Master_List.add(new Hiragana("\u3089", "ra", "base", "r"));
        Master_List.add(new Hiragana("\u308A", "ri", "base", "r"));
        Master_List.add(new Hiragana("\u308B", "ru", "base", "r"));
        Master_List.add(new Hiragana("\u308C", "re", "base", "r"));
        Master_List.add(new Hiragana("\u308D", "ro", "base", "r"));
        //W-section
        Master_List.add(new Hiragana("\u308F", "wa", "base", "w"));
        Master_List.add(new Hiragana("\u3092", "wo", "base", "w"));
        Master_List.add(new Hiragana("\u3093", "n", "base", "w"));
        //VARIANTS
        //k-section
        Master_List.add(new Hiragana("\u304C", "ga", "variant", "k"));
        Master_List.add(new Hiragana("\u304E", "gi", "variant", "k"));
        Master_List.add(new Hiragana("\u3050", "gu", "variant", "k"));
        Master_List.add(new Hiragana("\u3052", "ge", "variant", "k"));
        Master_List.add(new Hiragana("\u3054", "go", "variant", "k"));
        //s-section
        Master_List.add(new Hiragana("\u3056", "za", "variant", "s"));
        Master_List.add(new Hiragana("\u3058", "ji", "variant", "s"));
        Master_List.add(new Hiragana("\u305A", "zu", "variant", "s"));
        Master_List.add(new Hiragana("\u305C", "ze", "variant", "s"));
        Master_List.add(new Hiragana("\u305F", "zo", "variant", "s"));
        //t-section
        Master_List.add(new Hiragana("\u3060", "da", "variant", "t"));
        Master_List.add(new Hiragana("\u3062", "ji", "variant", "t"));
        Master_List.add(new Hiragana("\u3065", "zu", "variant", "t"));
        Master_List.add(new Hiragana("\u3067", "de", "variant", "t"));
        Master_List.add(new Hiragana("\u3069", "do", "variant", "t"));
        //H-section
        Master_List.add(new Hiragana("\u3070", "ba", "variant", "h"));
        Master_List.add(new Hiragana("\u3073", "bi", "variant", "h"));
        Master_List.add(new Hiragana("\u3076", "bu", "variant", "h"));
        Master_List.add(new Hiragana("\u3079", "be", "variant", "h"));
        Master_List.add(new Hiragana("\u307C", "bo", "variant", "h"));
        Master_List.add(new Hiragana("\u3071", "pa", "variant", "h"));
        Master_List.add(new Hiragana("\u3074", "pi", "variant", "h"));
        Master_List.add(new Hiragana("\u3077", "pu", "variant", "h"));
        Master_List.add(new Hiragana("\u307A", "pe", "variant", "h"));
        Master_List.add(new Hiragana("\u307D", "po", "variant", "h"));
        //COMBO-BASE
        //k-section
        Master_List.add(new Hiragana("\u304D\u3084", "kya", "combo", "k"));
        Master_List.add(new Hiragana("\u304D\u3086", "kyu", "combo", "k"));
        Master_List.add(new Hiragana("\u304D\u3088", "kyo", "combo", "k"));
        //s-section
        Master_List.add(new Hiragana("\u3057\u3084", "sha", "combo", "s"));
        Master_List.add(new Hiragana("\u3057\u3086", "shu", "combo", "s"));
        Master_List.add(new Hiragana("\u3057\u3088", "sho", "combo", "s"));
        //t-section
        Master_List.add(new Hiragana("\u3061\u3084", "cha", "combo", "t"));
        Master_List.add(new Hiragana("\u3061\u3086", "chu", "combo", "t"));
        Master_List.add(new Hiragana("\u3061\u3088", "cho", "combo", "t"));
        //n-section
        Master_List.add(new Hiragana("\u306B\u3084", "nya", "combo", "n"));
        Master_List.add(new Hiragana("\u306B\u3086", "nyu", "combo", "n"));
        Master_List.add(new Hiragana("\u306B\u3088", "nyo", "combo", "n"));
        //h-section
        Master_List.add(new Hiragana("\u3072\u3084", "hya", "combo", "h"));
        Master_List.add(new Hiragana("\u3072\u3086", "hyu", "combo", "h"));
        Master_List.add(new Hiragana("\u3072\u3088", "hyo", "combo", "h"));
        //m-section
        Master_List.add(new Hiragana("\u307F\u3084", "mya", "combo", "m"));
        Master_List.add(new Hiragana("\u307F\u3086", "myu", "combo", "m"));
        Master_List.add(new Hiragana("\u307F\u3088", "myo", "combo", "m"));
        //r-section
        Master_List.add(new Hiragana("\u308A\u3084", "rya", "combo", "r"));
        Master_List.add(new Hiragana("\u308A\u3086", "ryu", "combo", "r"));
        Master_List.add(new Hiragana("\u308A\u3088", "ryo", "combo", "r"));
        //COMBO-VARIANT
        //k-section
        Master_List.add(new Hiragana("\u304E\u3084", "gya", "combo-variant", "k"));
        Master_List.add(new Hiragana("\u304E\u3086", "gyu", "combo-variant", "k"));
        Master_List.add(new Hiragana("\u304E\u3088", "gyo", "combo-variant", "k"));
        //s-section
        Master_List.add(new Hiragana("\u3058\u3084", "ja", "combo-variant", "s"));
        Master_List.add(new Hiragana("\u3058\u3086", "ju", "combo-variant", "s"));
        Master_List.add(new Hiragana("\u3058\u3088", "jo", "combo-variant", "s"));
        //t-section
        Master_List.add(new Hiragana("\u3062\u3084", "ja", "combo-variant", "t"));
        Master_List.add(new Hiragana("\u3062\u3086", "ju", "combo-variant", "t"));
        Master_List.add(new Hiragana("\u3062\u3088", "jo", "combo-variant", "t"));
        //h-section
        Master_List.add(new Hiragana("\u3073\u3084", "bya", "combo-variant", "h"));
        Master_List.add(new Hiragana("\u3073\u3086", "byu", "combo-variant", "h"));
        Master_List.add(new Hiragana("\u3073\u3088", "byo", "combo-variant", "h"));
        Master_List.add(new Hiragana("\u3074\u3084", "pya", "combo-variant", "h"));
        Master_List.add(new Hiragana("\u3074\u3086", "pyu", "combo-variant", "h"));
        Master_List.add(new Hiragana("\u3074\u3088", "pyo", "combo-variant", "h"));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(kana);
        parcel.writeString(romaji);
        parcel.writeString(type);
        parcel.writeString(group);
    }

    protected Hiragana(Parcel in) {
        kana = in.readString();
        romaji = in.readString();
        type = in.readString();
        group = in.readString();
    }

    public static final Creator<Hiragana> CREATOR = new Creator<Hiragana>() {
        @Override
        public Hiragana createFromParcel(Parcel in) {
            return new Hiragana(in);
        }

        @Override
        public Hiragana[] newArray(int size){
            return new Hiragana[size];
        }
    };
}

package com.example.courseworkjplapp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.List;

public class Katakana implements Parcelable{
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

    public static final List<Katakana> Master_List = new ArrayList<>();

    public Katakana(String kana, String romaji, String type, String group) {
        this.kana = kana;
        this.romaji = romaji;
        this.type = type;
        this.group = group;
    }

    static {
        //BASIC
        //vowels
        Master_List.add(new Katakana("\u30A2", "a", "base", "vowel"));
        Master_List.add(new Katakana("\u30A4", "i", "base", "vowel"));
        Master_List.add(new Katakana("\u30A6", "u", "base", "vowel"));
        Master_List.add(new Katakana("\u30A8", "e", "base", "vowel"));
        Master_List.add(new Katakana("\u30AA", "o", "base", "vowel"));
        //k-section
        Master_List.add(new Katakana("\u30AB", "ka", "base", "k"));
        Master_List.add(new Katakana("\u30AD", "ki", "base", "k"));
        Master_List.add(new Katakana("\u30AF", "ku", "base", "k"));
        Master_List.add(new Katakana("\u30B1", "ke", "base", "k"));
        Master_List.add(new Katakana("\u30B3", "ko", "base", "k"));
        //s-section
        Master_List.add(new Katakana("\u30B5", "sa", "base", "s"));
        Master_List.add(new Katakana("\u30B7", "shi", "base", "s"));
        Master_List.add(new Katakana("\u30B9", "su", "base", "s"));
        Master_List.add(new Katakana("\u30BB", "se", "base", "s"));
        Master_List.add(new Katakana("\u30BD", "so", "base", "s"));
        //t-section
        Master_List.add(new Katakana("\u30BF", "ta", "base", "t"));
        Master_List.add(new Katakana("\u30C1", "chi", "base", "t"));
        Master_List.add(new Katakana("\u30C4", "tsu", "base", "t"));
        Master_List.add(new Katakana("\u30C6", "te", "base", "t"));
        Master_List.add(new Katakana("\u30C8", "to", "base", "t"));
        //n-section
        Master_List.add(new Katakana("\u30CA", "na", "base", "n"));
        Master_List.add(new Katakana("\u30CB", "ni", "base", "n"));
        Master_List.add(new Katakana("\u30CC", "nu", "base", "n"));
        Master_List.add(new Katakana("\u30CD", "ne", "base", "n"));
        Master_List.add(new Katakana("\u30CE", "no", "base", "n"));
        //H-section
        Master_List.add(new Katakana("\u30CF", "ha", "base", "h"));
        Master_List.add(new Katakana("\u30D2", "hi", "base", "h"));
        Master_List.add(new Katakana("\u30D5", "fu", "base", "h"));
        Master_List.add(new Katakana("\u30D8", "he", "base", "h"));
        Master_List.add(new Katakana("\u30DB", "ho", "base", "h"));
        //M-section
        Master_List.add(new Katakana("\u30DE", "ma", "base", "m"));
        Master_List.add(new Katakana("\u30DF", "mi", "base", "m"));
        Master_List.add(new Katakana("\u30E0", "mu", "base", "m"));
        Master_List.add(new Katakana("\u30E1", "me", "base", "m"));
        Master_List.add(new Katakana("\u30E2", "mo", "base", "m"));
        //Y-section
        Master_List.add(new Katakana("\u30E4", "ya", "base", "y"));
        Master_List.add(new Katakana("\u30E6", "yu", "base", "y"));
        Master_List.add(new Katakana("\u30E8", "yo", "base", "y"));
        //R-section
        Master_List.add(new Katakana("\u30E9", "ra", "base", "r"));
        Master_List.add(new Katakana("\u30EA", "ri", "base", "r"));
        Master_List.add(new Katakana("\u30EB", "ru", "base", "r"));
        Master_List.add(new Katakana("\u30EC", "re", "base", "r"));
        Master_List.add(new Katakana("\u30ED", "ro", "base", "r"));
        //W-section
        Master_List.add(new Katakana("\u30EF", "wa", "base", "w"));
        Master_List.add(new Katakana("\u30F2", "wo", "base", "w"));
        Master_List.add(new Katakana("\u30F3", "n", "base", "w"));
        //VARIANTS
        //k-section
        Master_List.add(new Katakana("\u30AC", "ga", "variant", "k"));
        Master_List.add(new Katakana("\u30AE", "gi", "variant", "k"));
        Master_List.add(new Katakana("\u30B0", "gu", "variant", "k"));
        Master_List.add(new Katakana("\u30B2", "ge", "variant", "k"));
        Master_List.add(new Katakana("\u30B4", "go", "variant", "k"));
        //s-section
        Master_List.add(new Katakana("\u30B6", "za", "variant", "s"));
        Master_List.add(new Katakana("\u30B8", "ji", "variant", "s"));
        Master_List.add(new Katakana("\u30BA", "zu", "variant", "s"));
        Master_List.add(new Katakana("\u30BC", "ze", "variant", "s"));
        Master_List.add(new Katakana("\u30BE", "zo", "variant", "s"));
        //t-section
        Master_List.add(new Katakana("\u30C0", "da", "variant", "t"));
        Master_List.add(new Katakana("\u30C2", "ji", "variant", "t"));
        Master_List.add(new Katakana("\u30C5", "zu", "variant", "t"));
        Master_List.add(new Katakana("\u30C7", "de", "variant", "t"));
        Master_List.add(new Katakana("\u30C9", "do", "variant", "t"));
        //H-section
        Master_List.add(new Katakana("\u30D0", "ba", "variant", "h"));
        Master_List.add(new Katakana("\u30D3", "bi", "variant", "h"));
        Master_List.add(new Katakana("\u30D6", "bu", "variant", "h"));
        Master_List.add(new Katakana("\u30D9", "be", "variant", "h"));
        Master_List.add(new Katakana("\u30DC", "bo", "variant", "h"));
        Master_List.add(new Katakana("\u30D1", "pa", "variant", "h"));
        Master_List.add(new Katakana("\u30D4", "pi", "variant", "h"));
        Master_List.add(new Katakana("\u30D7", "pu", "variant", "h"));
        Master_List.add(new Katakana("\u30DA", "pe", "variant", "h"));
        Master_List.add(new Katakana("\u30DD", "po", "variant", "h"));
        //COMBO-BASE
        //k-section
        Master_List.add(new Katakana("\u30AD\u30E4", "kya", "combo", "k"));
        Master_List.add(new Katakana("\u30AD\u30E6", "kyu", "combo", "k"));
        Master_List.add(new Katakana("\u30AD\u30E8", "kyo", "combo", "k"));
        //s-section
        Master_List.add(new Katakana("\u30B7\u30E4", "sha", "combo", "s"));
        Master_List.add(new Katakana("\u30B7\u30E6", "shu", "combo", "s"));
        Master_List.add(new Katakana("\u30B7\u30E8", "sho", "combo", "s"));
        //t-section
        Master_List.add(new Katakana("\u30C1\u30E4", "cha", "combo", "t"));
        Master_List.add(new Katakana("\u30C1\u30E6", "chu", "combo", "t"));
        Master_List.add(new Katakana("\u30C1\u30E8", "cho", "combo", "t"));
        //n-section
        Master_List.add(new Katakana("\u30CB\u30E4", "nya", "combo", "n"));
        Master_List.add(new Katakana("\u30CB\u30E6", "nyu", "combo", "n"));
        Master_List.add(new Katakana("\u30CB\u30E8", "nyo", "combo", "n"));
        //h-section
        Master_List.add(new Katakana("\u30D2\u30E4", "hya", "combo", "h"));
        Master_List.add(new Katakana("\u30D2\u30E6", "hyu", "combo", "h"));
        Master_List.add(new Katakana("\u30D2\u30E8", "hyo", "combo", "h"));
        //m-section
        Master_List.add(new Katakana("\u30DF\u30E4", "mya", "combo", "m"));
        Master_List.add(new Katakana("\u30DF\u30E6", "myu", "combo", "m"));
        Master_List.add(new Katakana("\u30DF\u30E8", "myo", "combo", "m"));
        //r-section
        Master_List.add(new Katakana("\u30EA\u30E4", "rya", "combo", "r"));
        Master_List.add(new Katakana("\u30EA\u30E6", "ryu", "combo", "r"));
        Master_List.add(new Katakana("\u30EA\u30E8", "ryo", "combo", "r"));
        //COMBO-VARIANT
        //k-section
        Master_List.add(new Katakana("\u304E\u30E4", "gya", "combo-variant", "k"));
        Master_List.add(new Katakana("\u304E\u30E6", "gyu", "combo-variant", "k"));
        Master_List.add(new Katakana("\u304E\u30E8", "gyo", "combo-variant", "k"));
        //s-section
        Master_List.add(new Katakana("\u30B8\u30E4", "ja", "combo-variant", "s"));
        Master_List.add(new Katakana("\u30B8\u30E6", "ju", "combo-variant", "s"));
        Master_List.add(new Katakana("\u30B8\u30E8", "jo", "combo-variant", "s"));
        //t-section
        Master_List.add(new Katakana("\u30C2\u30E4", "ja", "combo-variant", "t"));
        Master_List.add(new Katakana("\u30C2\u30E6", "ju", "combo-variant", "t"));
        Master_List.add(new Katakana("\u30C2\u30E8", "jo", "combo-variant", "t"));
        //h-section
        Master_List.add(new Katakana("\u30D3\u30E4", "bya", "combo-variant", "h"));
        Master_List.add(new Katakana("\u30D3\u30E6", "byu", "combo-variant", "h"));
        Master_List.add(new Katakana("\u30D3\u30E8", "byo", "combo-variant", "h"));
        Master_List.add(new Katakana("\u30D4\u30E4", "pya", "combo-variant", "h"));
        Master_List.add(new Katakana("\u30D4\u30E6", "pyu", "combo-variant", "h"));
        Master_List.add(new Katakana("\u30D4\u30E8", "pyo", "combo-variant", "h"));
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

    protected Katakana(Parcel in) {
        kana = in.readString();
        romaji = in.readString();
        type = in.readString();
        group = in.readString();
    }

    public static final Creator<Katakana> CREATOR = new Creator<Katakana>() {
        @Override
        public Katakana createFromParcel(Parcel in) {
            return new Katakana(in);
        }

        @Override
        public Katakana[] newArray(int size){
            return new Katakana[size];
        }
    };
}

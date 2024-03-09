package _3_arrays_collections.exercise7;

import java.util.Objects;

public class LicensePlate {
    // final variables cannot be changed after object creation
    private final String code;
    private final String landCode;

    public LicensePlate(String landCode, String code) {
        this.code = code;
        this.landCode = landCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LicensePlate that = (LicensePlate) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(landCode, that.landCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, landCode);
    }

    @Override
    public String toString() {
        return landCode + " " + code;
    }
}


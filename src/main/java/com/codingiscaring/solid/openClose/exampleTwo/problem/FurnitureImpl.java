package com.codingiscaring.solid.openClose.exampleTwo.problem;

public class FurnitureImpl implements Furniture {
    public String getUse(String type) throws Exception {
        switch (type) {
            case "Table":
                return "To eat";
            case "Chair":
                return "To sit";
            default:
                throw new Exception("Furniture type not found");
        }
    }
}

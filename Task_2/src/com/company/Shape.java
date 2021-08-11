package com.company;

public class Shape {
        private String color;
        private boolean filled;

        public Shape() {
            color="red";
            filled=(color.equals("red"));
        }

        public Shape(String color, boolean filled) {
            setColor(color);
            setFilled(filled);
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean getFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        @Override
        public String toString() {
            return "A Shape with color of"+color+" and "+((filled)?"filled":"not filled");

        }





}

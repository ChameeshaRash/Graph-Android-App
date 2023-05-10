package com.university.graph;

public class ModelItem {

    public int modelImage;
    public String modelName;
    public String modelDescription;
    public String urlModelName;



    public ModelItem(int modelImage, String modelName, String modelDescription, String urlModelName) {
        this.modelImage = modelImage;
        this.modelName = modelName;
        this.modelDescription = modelDescription;
        this.urlModelName = urlModelName;
    }

    public ModelItem(int modelImage, String modelName, String modelDescription) {
        this.modelImage = modelImage;
        this.modelName = modelName;
        this.modelDescription = modelDescription;
    }

    public ModelItem(int modelImage, String modelName) {
        this.modelImage = modelImage;
        this.modelName = modelName;
    }


    public int getModelImage() {
        return modelImage;
    }

    public void setModelImage(int modelImage) {
        this.modelImage = modelImage;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }
    public String getUrlModelName() {
        return urlModelName;
    }

    public void setUrlModelName(String urlModelName) {
        this.urlModelName = urlModelName;
    }
}

interface OptimizableModel{
      void quantize();
}
class ResNet18 implements OptimizableModel{
    public void quantize(){
        System.out.println("Applying int8 quantization for ResNet-18.");
    }
}

class MobileNet implements OptimizableModel{
    public void quantize(){
        System.out.println("Applying dynamic quantization for MobileNet.");
    }
}
class InferenceEngine{
    public void optimizeModel(OptimizableModel model){
        model.quantize();
    }


}

public class Main4 {
    public static void main(String[] args) {
        InferenceEngine engine = new InferenceEngine();
        OptimizableModel model1 = new ResNet18();
        OptimizableModel model2 = new MobileNet();

        engine.optimizeModel(model1);
        engine.optimizeModel(model2);
        
    }
}


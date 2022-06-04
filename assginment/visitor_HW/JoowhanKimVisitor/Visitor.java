public abstract class Visitor {
    public abstract void visit(Engine engine);
    
    public abstract void visit(ElectricMotor motor);
    public abstract void visit(RegenerativeBrake brake);
}


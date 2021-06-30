
CREATE PROCEDURE sp_Insertar_Examen_Realizado
(@fecha DATETIME, @Paciente_ID INT , @Doctor_ID INT)
AS
BEGIN
INSERT INTO Examen_Realizado
           (fecha
           ,Paciente_ID
           ,Doctor_ID)
     VALUES
           (@fecha,
            @Paciente_ID,
            @Doctor_ID)
END
----------------------------------------------------
CREATE PROCEDURE sp_Insertar_Detalle_Examen
(@Examen_Realizado_ID INT, @Prueba_ID INT, @valor VARCHAR(25))
AS
BEGIN
INSERT INTO Detalle_Examen
           (Examen_Realizado_ID
           ,Prueba_ID
           ,valor)
     VALUES
           (@Examen_Realizado_ID,
            @Prueba_ID,
            @valor)
END
-----------------------------------------------
CREATE PROCEDURE sp_Buscar_Ultimo_Examen
AS 
BEGIN
SELECT TOP(1) Examen_Realizado_ID FROM Examen_Realizado
ORDER BY Examen_Realizado_ID DESC
END
-----------------------------------------------
CREATE PROCEDURE sp_Buscar_Prueba
(@Tipo_Examen INT, @Criterio INT)
AS 
BEGIN
SELECT P.Prueba_ID FROM Prueba P
WHERE P.Tipo_Examen_ID=@Tipo_Examen
	  AND P.Criterio_ID=@Criterio
END

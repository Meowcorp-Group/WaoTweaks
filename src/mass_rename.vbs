Set objFso = CreateObject("Scripting.FileSystemObject")
Set Folder = objFso.GetFolder("C:\Users\Waoweens\Documents\mod2\WaoTweaks\src\main\resources\data\waotweaks\recipes\")

For Each File In Folder.Files
    sNewFile = File.Name
    sNewFile = Replace(sNewFile,"enderite","voidorite")
    if (sNewFile<>File.Name) then
        File.Move(File.ParentFolder+"\"+sNewFile)
    end if

Next
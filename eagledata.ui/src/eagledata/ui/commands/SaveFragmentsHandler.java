package eagledata.ui.commands;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.json.JSONObject;

import eagledata.core.dsl.datadesc.DataDslStandaloneSetup;
import eagledata.core.dsl.datadesc.dataDsl.DataFragment;
import eagledata.core.dsl.datadesc.dataDsl.DataPackableDescription;
import eagledata.ui.Activator;
import eagledata.ui.http.JsonFragment;


public class SaveFragmentsHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = workbench == null ? null : workbench.getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window == null ? null : window.getActivePage();

		IEditorPart editor = activePage == null ? null : activePage.getActiveEditor();
		IEditorInput input = editor == null ? null : editor.getEditorInput();
		IPath path = input instanceof FileEditorInput ? ((FileEditorInput)input).getPath(): null;
		
		if (path != null){
			String extension = "datad";
		    if(path.getFileExtension().equals("datad")){
		    	try {
					EObject allXtextContents = Activator.loadXtextFile(path.toFile(), new DataDslStandaloneSetup(), extension);
				
					TreeIterator<EObject> iterator = allXtextContents.eAllContents();
			    	while(iterator.hasNext()) {
			    		EObject element = iterator.next();
			    		if(element instanceof eagledata.core.dsl.datadesc.dataDsl.Package){
			    			List<DataPackableDescription> packableElements = ((eagledata.core.dsl.datadesc.dataDsl.Package) element).getElements();
			    			for(DataPackableDescription packableElement : packableElements){
			    				if(element instanceof DataFragment){
					    			DataFragment fragment = (DataFragment) element;
					    			JSONObject fragmentJsonObject = JsonFragment.fragment2json(fragment);
					    			
					    			
					    			//if(JsonFragment.post(fragmentJsonObject)){
					    				//showMessage("se ha subido");
					    			//}else{
					    				//showMessage("no se ha subido");
					    			//}
					    		}	
			    			}
			    		}
			    		
			    	}
		    	} catch (IOException e) {
					e.printStackTrace();
				}	
		    }
		}
		
		return null;
	}
	
	private void showMessage(String message) {
		MessageDialog.openInformation(null, "Fragments", message);
	}
}

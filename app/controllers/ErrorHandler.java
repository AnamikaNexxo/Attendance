//
//
//import org.omg.CosNaming.NamingContextPackage.NotFound;
//import play.http.HttpErrorHandler;
//import play.mvc.*;
//import play.mvc.Http.*;
//
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.CompletionStage;
//import javax.inject.Singleton;
//
//@Singleton
//public class ErrorHandler implements HttpErrorHandler {
//    public CompletionStage<Result> onClientError(
//            RequestHeader request, int statusCode, String message) {
//       return CompletableFuture.completedFuture(
//               Results.badRequest(views.html.error404.render()));
//             //  Results.status(statusCode, "A client error occurred: " + message));
//    }
//    public CompletionStage<Result> onServerError(RequestHeader request, Throwable exception) {
//        return CompletableFuture.completedFuture(
//             //   Results.internalServerError("A server error occurred: " + exception.getMessage()));
//                Results.badRequest(views.html.error500.render()));
//    }
//}